/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.accessapproval.v1.spring;

import com.google.api.core.BetaApi;
import com.google.cloud.spring.core.Credentials;
import com.google.cloud.spring.core.CredentialsSupplier;
import com.google.cloud.spring.core.Retry;
import javax.annotation.Generated;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/** Provides default property values for AccessApproval client bean */
@Generated("by google-cloud-spring-generator")
@BetaApi("Autogenerated Spring autoconfiguration is not yet stable")
@ConfigurationProperties("com.google.cloud.accessapproval.v1.access-approval")
public class AccessApprovalSpringProperties implements CredentialsSupplier {
  /** OAuth2 credentials to authenticate and authorize calls to Google Cloud Client Libraries. */
  @NestedConfigurationProperty
  private final Credentials credentials =
      new Credentials("https://www.googleapis.com/auth/cloud-platform");
  /** Quota project to use for billing. */
  private String quotaProjectId;
  /** Number of threads used for executors. */
  private Integer executorThreadCount;
  /** Allow override of default transport channel provider to use REST instead of gRPC. */
  private boolean useRest = false;
  /** Allow override of retry settings at service level, applying to all of its RPC methods. */
  @NestedConfigurationProperty private Retry retry;
  /**
   * Allow override of retry settings at method-level for listApprovalRequests. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listApprovalRequestsRetry;
  /**
   * Allow override of retry settings at method-level for getApprovalRequest. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getApprovalRequestRetry;
  /**
   * Allow override of retry settings at method-level for approveApprovalRequest. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry approveApprovalRequestRetry;
  /**
   * Allow override of retry settings at method-level for dismissApprovalRequest. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry dismissApprovalRequestRetry;
  /**
   * Allow override of retry settings at method-level for invalidateApprovalRequest. If defined,
   * this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry invalidateApprovalRequestRetry;
  /**
   * Allow override of retry settings at method-level for getAccessApprovalSettings. If defined,
   * this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getAccessApprovalSettingsRetry;
  /**
   * Allow override of retry settings at method-level for updateAccessApprovalSettings. If defined,
   * this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry updateAccessApprovalSettingsRetry;
  /**
   * Allow override of retry settings at method-level for deleteAccessApprovalSettings. If defined,
   * this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry deleteAccessApprovalSettingsRetry;
  /**
   * Allow override of retry settings at method-level for getAccessApprovalServiceAccount. If
   * defined, this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getAccessApprovalServiceAccountRetry;

  @Override
  public Credentials getCredentials() {
    return this.credentials;
  }

  public String getQuotaProjectId() {
    return this.quotaProjectId;
  }

  public void setQuotaProjectId(String quotaProjectId) {
    this.quotaProjectId = quotaProjectId;
  }

  public boolean getUseRest() {
    return this.useRest;
  }

  public void setUseRest(boolean useRest) {
    this.useRest = useRest;
  }

  public Integer getExecutorThreadCount() {
    return this.executorThreadCount;
  }

  public void setExecutorThreadCount(Integer executorThreadCount) {
    this.executorThreadCount = executorThreadCount;
  }

  public Retry getRetry() {
    return this.retry;
  }

  public void setRetry(Retry retry) {
    this.retry = retry;
  }

  public Retry getListApprovalRequestsRetry() {
    return this.listApprovalRequestsRetry;
  }

  public void setListApprovalRequestsRetry(Retry listApprovalRequestsRetry) {
    this.listApprovalRequestsRetry = listApprovalRequestsRetry;
  }

  public Retry getGetApprovalRequestRetry() {
    return this.getApprovalRequestRetry;
  }

  public void setGetApprovalRequestRetry(Retry getApprovalRequestRetry) {
    this.getApprovalRequestRetry = getApprovalRequestRetry;
  }

  public Retry getApproveApprovalRequestRetry() {
    return this.approveApprovalRequestRetry;
  }

  public void setApproveApprovalRequestRetry(Retry approveApprovalRequestRetry) {
    this.approveApprovalRequestRetry = approveApprovalRequestRetry;
  }

  public Retry getDismissApprovalRequestRetry() {
    return this.dismissApprovalRequestRetry;
  }

  public void setDismissApprovalRequestRetry(Retry dismissApprovalRequestRetry) {
    this.dismissApprovalRequestRetry = dismissApprovalRequestRetry;
  }

  public Retry getInvalidateApprovalRequestRetry() {
    return this.invalidateApprovalRequestRetry;
  }

  public void setInvalidateApprovalRequestRetry(Retry invalidateApprovalRequestRetry) {
    this.invalidateApprovalRequestRetry = invalidateApprovalRequestRetry;
  }

  public Retry getGetAccessApprovalSettingsRetry() {
    return this.getAccessApprovalSettingsRetry;
  }

  public void setGetAccessApprovalSettingsRetry(Retry getAccessApprovalSettingsRetry) {
    this.getAccessApprovalSettingsRetry = getAccessApprovalSettingsRetry;
  }

  public Retry getUpdateAccessApprovalSettingsRetry() {
    return this.updateAccessApprovalSettingsRetry;
  }

  public void setUpdateAccessApprovalSettingsRetry(Retry updateAccessApprovalSettingsRetry) {
    this.updateAccessApprovalSettingsRetry = updateAccessApprovalSettingsRetry;
  }

  public Retry getDeleteAccessApprovalSettingsRetry() {
    return this.deleteAccessApprovalSettingsRetry;
  }

  public void setDeleteAccessApprovalSettingsRetry(Retry deleteAccessApprovalSettingsRetry) {
    this.deleteAccessApprovalSettingsRetry = deleteAccessApprovalSettingsRetry;
  }

  public Retry getGetAccessApprovalServiceAccountRetry() {
    return this.getAccessApprovalServiceAccountRetry;
  }

  public void setGetAccessApprovalServiceAccountRetry(Retry getAccessApprovalServiceAccountRetry) {
    this.getAccessApprovalServiceAccountRetry = getAccessApprovalServiceAccountRetry;
  }
}
