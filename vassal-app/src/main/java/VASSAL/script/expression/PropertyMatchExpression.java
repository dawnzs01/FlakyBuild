/*
 *
 * Copyright (c) 2009 Brent Easton
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Library General Public
 * License (LGPL) as published by the Free Software Foundation.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this library; if not, copies are available
 * at http://www.opensource.org.
 */
package VASSAL.script.expression;

import VASSAL.build.module.properties.PropertySource;
import VASSAL.counters.PieceFilter;
import VASSAL.counters.PropertiesPieceFilter;
import VASSAL.tools.FormattedString;

import java.util.Map;

import org.apache.commons.lang3.tuple.Pair;

/**
 * An old-style Property Match expression.
 */
public class PropertyMatchExpression extends Expression {
  protected PieceFilter filter;

  public PropertyMatchExpression(String s) {
    super(s);
  }

  /** @deprecated  */
  @Deprecated(since = "2021-06-11")
  @Override
  public String evaluate(PropertySource ps, Map<String, String> properties, boolean localized) {
    return null;
  }

  /** @deprecated  */
  @Deprecated(since = "2021-06-11")
  @Override
  public PieceFilter getFilter(PropertySource ps) {
    return getFilter(ps, null, null);
  }

  @Override
  public PieceFilter getFilter(PropertySource ps, Auditable owner, AuditTrail audit) {

    if (filter != null) {
      return filter;
    }

    final PieceFilter pf = PropertiesPieceFilter.parse(new FormattedString(getExpression()).getText(ps, owner, audit));
    if (!isDynamic()) {
      filter = pf;
    }

    return pf;
  }

  protected boolean isDynamic() {
    return getExpression() != null && getExpression().indexOf('$') >= 0;
  }

  @Override
  public String toBeanShellString() {
    return PropertiesPieceFilter.toBeanShellString(getExpression());
  }

  public static Expression instance(String s) {
    return CACHE.computeIfAbsent(Pair.of(s, PropertyMatchExpression.class), k -> new PropertyMatchExpression(s));
  }
}
