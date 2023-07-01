/*
 *  This file is part of AndroidIDE.
 *
 *  AndroidIDE is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  AndroidIDE is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with AndroidIDE.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.itsaky.androidide.lexers

import com.google.common.truth.Truth.assertThat
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.Token

/**
 * Base class for lexer tests.
 *
 * @author Akash Yadav
 */
open class BaseLexerTest {
  protected open fun createStream(input: String): CharStream = CharStreams.fromString(input)

  protected open fun ensureTokenSequence(tokens: List<Token>, expectedTypes: List<Int>) {
    assertThat(tokens.size).isEqualTo(expectedTypes.size)
    for ((index, token) in tokens.withIndex()) {
      assertThat(token.type).isEqualTo(expectedTypes[index])
    }
  }
}
