/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the properties of an environment.
 * </p>
 */
public class CreateEnvironmentResult implements Serializable, Cloneable {

    /**
     * <p>
     * The name of this environment.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The ID of this environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The name of the application associated with this environment.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The application version deployed in this environment.
     * </p>
     */
    private String versionLabel;
    /**
     * <p>
     * The name of the <code>SolutionStack</code> deployed with this
     * environment.
     * </p>
     */
    private String solutionStackName;
    /**
     * <p>
     * The name of the configuration template used to originally launch this
     * environment.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * Describes this environment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * For load-balanced, autoscaling environments, the URL to the LoadBalancer.
     * For single-instance environments, the IP address of the instance.
     * </p>
     */
    private String endpointURL;
    /**
     * <p>
     * The URL to the CNAME for this environment.
     * </p>
     */
    private String cNAME;
    /**
     * <p>
     * The creation date for this environment.
     * </p>
     */
    private java.util.Date dateCreated;
    /**
     * <p>
     * The last modified date for this environment.
     * </p>
     */
    private java.util.Date dateUpdated;
    /**
     * <p>
     * The current operational status of the environment:
     * </p>
     * <ul>
     * <li> <code>Launching</code>: Environment is in the process of initial
     * deployment.</li>
     * <li> <code>Updating</code>: Environment is in the process of updating its
     * configuration settings or application version.</li>
     * <li> <code>Ready</code>: Environment is available to have an action
     * performed on it, such as update or terminate.</li>
     * <li> <code>Terminating</code>: Environment is in the shut-down process.</li>
     * <li> <code>Terminated</code>: Environment is not running.</li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Indicates if there is an in-progress environment configuration update or
     * application version deployment that you can cancel.
     * </p>
     * <p>
     * <code>true:</code> There is an update in progress.
     * </p>
     * <p>
     * <code>false:</code> There are no updates currently in progress.
     * </p>
     */
    private Boolean abortableOperationInProgress;
    /**
     * <p>
     * Describes the health status of the environment. AWS Elastic Beanstalk
     * indicates the failure levels for a running environment:
     * </p>
     * <ul>
     * <li> <code>Red</code>: Indicates the environment is not responsive. Occurs
     * when three or more consecutive failures occur for an environment.</li>
     * <li> <code>Yellow</code>: Indicates that something is wrong. Occurs when
     * two consecutive failures occur for an environment.</li>
     * <li> <code>Green</code>: Indicates the environment is healthy and fully
     * functional.</li>
     * <li> <code>Grey</code>: Default health for a new environment. The
     * environment is not fully launched and health checks have not started or
     * health checks are suspended during an <code>UpdateEnvironment</code> or
     * <code>RestartEnvironement</code> request.</li>
     * </ul>
     * <p>
     * Default: <code>Grey</code>
     * </p>
     */
    private String health;
    /**
     * <p>
     * Returns the health status of the application running in your environment.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     */
    private String healthStatus;
    /**
     * <p>
     * The description of the AWS resources used by this environment.
     * </p>
     */
    private EnvironmentResourcesDescription resources;
    /**
     * <p>
     * Describes the current tier of this environment.
     * </p>
     */
    private EnvironmentTier tier;
    /**
     * <p>
     * A list of links to other environments in the same group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EnvironmentLink> environmentLinks;

    /**
     * <p>
     * The name of this environment.
     * </p>
     * 
     * @param environmentName
     *        The name of this environment.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of this environment.
     * </p>
     * 
     * @return The name of this environment.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of this environment.
     * </p>
     * 
     * @param environmentName
     *        The name of this environment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateEnvironmentResult withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The ID of this environment.
     * </p>
     * 
     * @param environmentId
     *        The ID of this environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of this environment.
     * </p>
     * 
     * @return The ID of this environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The ID of this environment.
     * </p>
     * 
     * @param environmentId
     *        The ID of this environment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateEnvironmentResult withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The name of the application associated with this environment.
     * </p>
     * 
     * @param applicationName
     *        The name of the application associated with this environment.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application associated with this environment.
     * </p>
     * 
     * @return The name of the application associated with this environment.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application associated with this environment.
     * </p>
     * 
     * @param applicationName
     *        The name of the application associated with this environment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateEnvironmentResult withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The application version deployed in this environment.
     * </p>
     * 
     * @param versionLabel
     *        The application version deployed in this environment.
     */

    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * <p>
     * The application version deployed in this environment.
     * </p>
     * 
     * @return The application version deployed in this environment.
     */

    public String getVersionLabel() {
        return this.versionLabel;
    }

    /**
     * <p>
     * The application version deployed in this environment.
     * </p>
     * 
     * @param versionLabel
     *        The application version deployed in this environment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateEnvironmentResult withVersionLabel(String versionLabel) {
        setVersionLabel(versionLabel);
        return this;
    }

    /**
     * <p>
     * The name of the <code>SolutionStack</code> deployed with this
     * environment.
     * </p>
     * 
     * @param solutionStackName
     *        The name of the <code>SolutionStack</code> deployed with this
     *        environment.
     */

    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }

    /**
     * <p>
     * The name of the <code>SolutionStack</code> deployed with this
     * environment.
     * </p>
     * 
     * @return The name of the <code>SolutionStack</code> deployed with this
     *         environment.
     */

    public String getSolutionStackName() {
        return this.solutionStackName;
    }

    /**
     * <p>
     * The name of the <code>SolutionStack</code> deployed with this
     * environment.
     * </p>
     * 
     * @param solutionStackName
     *        The name of the <code>SolutionStack</code> deployed with this
     *        environment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateEnvironmentResult withSolutionStackName(
            String solutionStackName) {
        setSolutionStackName(solutionStackName);
        return this;
    }

    /**
     * <p>
     * The name of the configuration template used to originally launch this
     * environment.
     * </p>
     * 
     * @param templateName
     *        The name of the configuration template used to originally launch
     *        this environment.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the configuration template used to originally launch this
     * environment.
     * </p>
     * 
     * @return The name of the configuration template used to originally launch
     *         this environment.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the configuration template used to originally launch this
     * environment.
     * </p>
     * 
     * @param templateName
     *        The name of the configuration template used to originally launch
     *        this environment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateEnvironmentResult withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * Describes this environment.
     * </p>
     * 
     * @param description
     *        Describes this environment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Describes this environment.
     * </p>
     * 
     * @return Describes this environment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Describes this environment.
     * </p>
     * 
     * @param description
     *        Describes this environment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateEnvironmentResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * For load-balanced, autoscaling environments, the URL to the LoadBalancer.
     * For single-instance environments, the IP address of the instance.
     * </p>
     * 
     * @param endpointURL
     *        For load-balanced, autoscaling environments, the URL to the
     *        LoadBalancer. For single-instance environments, the IP address of
     *        the instance.
     */

    public void setEndpointURL(String endpointURL) {
        this.endpointURL = endpointURL;
    }

    /**
     * <p>
     * For load-balanced, autoscaling environments, the URL to the LoadBalancer.
     * For single-instance environments, the IP address of the instance.
     * </p>
     * 
     * @return For load-balanced, autoscaling environments, the URL to the
     *         LoadBalancer. For single-instance environments, the IP address of
     *         the instance.
     */

    public String getEndpointURL() {
        return this.endpointURL;
    }

    /**
     * <p>
     * For load-balanced, autoscaling environments, the URL to the LoadBalancer.
     * For single-instance environments, the IP address of the instance.
     * </p>
     * 
     * @param endpointURL
     *        For load-balanced, autoscaling environments, the URL to the
     *        LoadBalancer. For single-instance environments, the IP address of
     *        the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateEnvironmentResult withEndpointURL(String endpointURL) {
        setEndpointURL(endpointURL);
        return this;
    }

    /**
     * <p>
     * The URL to the CNAME for this environment.
     * </p>
     * 
     * @param cNAME
     *        The URL to the CNAME for this environment.
     */

    public void setCNAME(String cNAME) {
        this.cNAME = cNAME;
    }

    /**
     * <p>
     * The URL to the CNAME for this environment.
     * </p>
     * 
     * @return The URL to the CNAME for this environment.
     */

    public String getCNAME() {
        return this.cNAME;
    }

    /**
     * <p>
     * The URL to the CNAME for this environment.
     * </p>
     * 
     * @param cNAME
     *        The URL to the CNAME for this environment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateEnvironmentResult withCNAME(String cNAME) {
        setCNAME(cNAME);
        return this;
    }

    /**
     * <p>
     * The creation date for this environment.
     * </p>
     * 
     * @param dateCreated
     *        The creation date for this environment.
     */

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The creation date for this environment.
     * </p>
     * 
     * @return The creation date for this environment.
     */

    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The creation date for this environment.
     * </p>
     * 
     * @param dateCreated
     *        The creation date for this environment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateEnvironmentResult withDateCreated(java.util.Date dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    /**
     * <p>
     * The last modified date for this environment.
     * </p>
     * 
     * @param dateUpdated
     *        The last modified date for this environment.
     */

    public void setDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * <p>
     * The last modified date for this environment.
     * </p>
     * 
     * @return The last modified date for this environment.
     */

    public java.util.Date getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * <p>
     * The last modified date for this environment.
     * </p>
     * 
     * @param dateUpdated
     *        The last modified date for this environment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateEnvironmentResult withDateUpdated(java.util.Date dateUpdated) {
        setDateUpdated(dateUpdated);
        return this;
    }

    /**
     * <p>
     * The current operational status of the environment:
     * </p>
     * <ul>
     * <li> <code>Launching</code>: Environment is in the process of initial
     * deployment.</li>
     * <li> <code>Updating</code>: Environment is in the process of updating its
     * configuration settings or application version.</li>
     * <li> <code>Ready</code>: Environment is available to have an action
     * performed on it, such as update or terminate.</li>
     * <li> <code>Terminating</code>: Environment is in the shut-down process.</li>
     * <li> <code>Terminated</code>: Environment is not running.</li>
     * </ul>
     * 
     * @param status
     *        The current operational status of the environment: </p>
     *        <ul>
     *        <li> <code>Launching</code>: Environment is in the process of
     *        initial deployment.</li>
     *        <li> <code>Updating</code>: Environment is in the process of
     *        updating its configuration settings or application version.</li>
     *        <li> <code>Ready</code>: Environment is available to have an action
     *        performed on it, such as update or terminate.</li>
     *        <li> <code>Terminating</code>: Environment is in the shut-down
     *        process.</li>
     *        <li> <code>Terminated</code>: Environment is not running.</li>
     * @see EnvironmentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current operational status of the environment:
     * </p>
     * <ul>
     * <li> <code>Launching</code>: Environment is in the process of initial
     * deployment.</li>
     * <li> <code>Updating</code>: Environment is in the process of updating its
     * configuration settings or application version.</li>
     * <li> <code>Ready</code>: Environment is available to have an action
     * performed on it, such as update or terminate.</li>
     * <li> <code>Terminating</code>: Environment is in the shut-down process.</li>
     * <li> <code>Terminated</code>: Environment is not running.</li>
     * </ul>
     * 
     * @return The current operational status of the environment: </p>
     *         <ul>
     *         <li> <code>Launching</code>: Environment is in the process of
     *         initial deployment.</li>
     *         <li> <code>Updating</code>: Environment is in the process of
     *         updating its configuration settings or application version.</li>
     *         <li> <code>Ready</code>: Environment is available to have an
     *         action performed on it, such as update or terminate.</li>
     *         <li> <code>Terminating</code>: Environment is in the shut-down
     *         process.</li>
     *         <li> <code>Terminated</code>: Environment is not running.</li>
     * @see EnvironmentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current operational status of the environment:
     * </p>
     * <ul>
     * <li> <code>Launching</code>: Environment is in the process of initial
     * deployment.</li>
     * <li> <code>Updating</code>: Environment is in the process of updating its
     * configuration settings or application version.</li>
     * <li> <code>Ready</code>: Environment is available to have an action
     * performed on it, such as update or terminate.</li>
     * <li> <code>Terminating</code>: Environment is in the shut-down process.</li>
     * <li> <code>Terminated</code>: Environment is not running.</li>
     * </ul>
     * 
     * @param status
     *        The current operational status of the environment: </p>
     *        <ul>
     *        <li> <code>Launching</code>: Environment is in the process of
     *        initial deployment.</li>
     *        <li> <code>Updating</code>: Environment is in the process of
     *        updating its configuration settings or application version.</li>
     *        <li> <code>Ready</code>: Environment is available to have an action
     *        performed on it, such as update or terminate.</li>
     *        <li> <code>Terminating</code>: Environment is in the shut-down
     *        process.</li>
     *        <li> <code>Terminated</code>: Environment is not running.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EnvironmentStatus
     */

    public CreateEnvironmentResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current operational status of the environment:
     * </p>
     * <ul>
     * <li> <code>Launching</code>: Environment is in the process of initial
     * deployment.</li>
     * <li> <code>Updating</code>: Environment is in the process of updating its
     * configuration settings or application version.</li>
     * <li> <code>Ready</code>: Environment is available to have an action
     * performed on it, such as update or terminate.</li>
     * <li> <code>Terminating</code>: Environment is in the shut-down process.</li>
     * <li> <code>Terminated</code>: Environment is not running.</li>
     * </ul>
     * 
     * @param status
     *        The current operational status of the environment: </p>
     *        <ul>
     *        <li> <code>Launching</code>: Environment is in the process of
     *        initial deployment.</li>
     *        <li> <code>Updating</code>: Environment is in the process of
     *        updating its configuration settings or application version.</li>
     *        <li> <code>Ready</code>: Environment is available to have an action
     *        performed on it, such as update or terminate.</li>
     *        <li> <code>Terminating</code>: Environment is in the shut-down
     *        process.</li>
     *        <li> <code>Terminated</code>: Environment is not running.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EnvironmentStatus
     */

    public void setStatus(EnvironmentStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current operational status of the environment:
     * </p>
     * <ul>
     * <li> <code>Launching</code>: Environment is in the process of initial
     * deployment.</li>
     * <li> <code>Updating</code>: Environment is in the process of updating its
     * configuration settings or application version.</li>
     * <li> <code>Ready</code>: Environment is available to have an action
     * performed on it, such as update or terminate.</li>
     * <li> <code>Terminating</code>: Environment is in the shut-down process.</li>
     * <li> <code>Terminated</code>: Environment is not running.</li>
     * </ul>
     * 
     * @param status
     *        The current operational status of the environment: </p>
     *        <ul>
     *        <li> <code>Launching</code>: Environment is in the process of
     *        initial deployment.</li>
     *        <li> <code>Updating</code>: Environment is in the process of
     *        updating its configuration settings or application version.</li>
     *        <li> <code>Ready</code>: Environment is available to have an action
     *        performed on it, such as update or terminate.</li>
     *        <li> <code>Terminating</code>: Environment is in the shut-down
     *        process.</li>
     *        <li> <code>Terminated</code>: Environment is not running.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EnvironmentStatus
     */

    public CreateEnvironmentResult withStatus(EnvironmentStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates if there is an in-progress environment configuration update or
     * application version deployment that you can cancel.
     * </p>
     * <p>
     * <code>true:</code> There is an update in progress.
     * </p>
     * <p>
     * <code>false:</code> There are no updates currently in progress.
     * </p>
     * 
     * @param abortableOperationInProgress
     *        Indicates if there is an in-progress environment configuration
     *        update or application version deployment that you can cancel.</p>
     *        <p>
     *        <code>true:</code> There is an update in progress.
     *        </p>
     *        <p>
     *        <code>false:</code> There are no updates currently in progress.
     */

    public void setAbortableOperationInProgress(
            Boolean abortableOperationInProgress) {
        this.abortableOperationInProgress = abortableOperationInProgress;
    }

    /**
     * <p>
     * Indicates if there is an in-progress environment configuration update or
     * application version deployment that you can cancel.
     * </p>
     * <p>
     * <code>true:</code> There is an update in progress.
     * </p>
     * <p>
     * <code>false:</code> There are no updates currently in progress.
     * </p>
     * 
     * @return Indicates if there is an in-progress environment configuration
     *         update or application version deployment that you can cancel.</p>
     *         <p>
     *         <code>true:</code> There is an update in progress.
     *         </p>
     *         <p>
     *         <code>false:</code> There are no updates currently in progress.
     */

    public Boolean getAbortableOperationInProgress() {
        return this.abortableOperationInProgress;
    }

    /**
     * <p>
     * Indicates if there is an in-progress environment configuration update or
     * application version deployment that you can cancel.
     * </p>
     * <p>
     * <code>true:</code> There is an update in progress.
     * </p>
     * <p>
     * <code>false:</code> There are no updates currently in progress.
     * </p>
     * 
     * @param abortableOperationInProgress
     *        Indicates if there is an in-progress environment configuration
     *        update or application version deployment that you can cancel.</p>
     *        <p>
     *        <code>true:</code> There is an update in progress.
     *        </p>
     *        <p>
     *        <code>false:</code> There are no updates currently in progress.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateEnvironmentResult withAbortableOperationInProgress(
            Boolean abortableOperationInProgress) {
        setAbortableOperationInProgress(abortableOperationInProgress);
        return this;
    }

    /**
     * <p>
     * Indicates if there is an in-progress environment configuration update or
     * application version deployment that you can cancel.
     * </p>
     * <p>
     * <code>true:</code> There is an update in progress.
     * </p>
     * <p>
     * <code>false:</code> There are no updates currently in progress.
     * </p>
     * 
     * @return Indicates if there is an in-progress environment configuration
     *         update or application version deployment that you can cancel.</p>
     *         <p>
     *         <code>true:</code> There is an update in progress.
     *         </p>
     *         <p>
     *         <code>false:</code> There are no updates currently in progress.
     */

    public Boolean isAbortableOperationInProgress() {
        return this.abortableOperationInProgress;
    }

    /**
     * <p>
     * Describes the health status of the environment. AWS Elastic Beanstalk
     * indicates the failure levels for a running environment:
     * </p>
     * <ul>
     * <li> <code>Red</code>: Indicates the environment is not responsive. Occurs
     * when three or more consecutive failures occur for an environment.</li>
     * <li> <code>Yellow</code>: Indicates that something is wrong. Occurs when
     * two consecutive failures occur for an environment.</li>
     * <li> <code>Green</code>: Indicates the environment is healthy and fully
     * functional.</li>
     * <li> <code>Grey</code>: Default health for a new environment. The
     * environment is not fully launched and health checks have not started or
     * health checks are suspended during an <code>UpdateEnvironment</code> or
     * <code>RestartEnvironement</code> request.</li>
     * </ul>
     * <p>
     * Default: <code>Grey</code>
     * </p>
     * 
     * @param health
     *        Describes the health status of the environment. AWS Elastic
     *        Beanstalk indicates the failure levels for a running environment:
     *        </p>
     *        <ul>
     *        <li> <code>Red</code>: Indicates the environment is not responsive.
     *        Occurs when three or more consecutive failures occur for an
     *        environment.</li>
     *        <li> <code>Yellow</code>: Indicates that something is wrong. Occurs
     *        when two consecutive failures occur for an environment.</li>
     *        <li> <code>Green</code>: Indicates the environment is healthy and
     *        fully functional.</li>
     *        <li> <code>Grey</code>: Default health for a new environment. The
     *        environment is not fully launched and health checks have not
     *        started or health checks are suspended during an
     *        <code>UpdateEnvironment</code> or <code>RestartEnvironement</code>
     *        request.</li>
     *        </ul>
     *        <p>
     *        Default: <code>Grey</code>
     * @see EnvironmentHealth
     */

    public void setHealth(String health) {
        this.health = health;
    }

    /**
     * <p>
     * Describes the health status of the environment. AWS Elastic Beanstalk
     * indicates the failure levels for a running environment:
     * </p>
     * <ul>
     * <li> <code>Red</code>: Indicates the environment is not responsive. Occurs
     * when three or more consecutive failures occur for an environment.</li>
     * <li> <code>Yellow</code>: Indicates that something is wrong. Occurs when
     * two consecutive failures occur for an environment.</li>
     * <li> <code>Green</code>: Indicates the environment is healthy and fully
     * functional.</li>
     * <li> <code>Grey</code>: Default health for a new environment. The
     * environment is not fully launched and health checks have not started or
     * health checks are suspended during an <code>UpdateEnvironment</code> or
     * <code>RestartEnvironement</code> request.</li>
     * </ul>
     * <p>
     * Default: <code>Grey</code>
     * </p>
     * 
     * @return Describes the health status of the environment. AWS Elastic
     *         Beanstalk indicates the failure levels for a running environment:
     *         </p>
     *         <ul>
     *         <li> <code>Red</code>: Indicates the environment is not
     *         responsive. Occurs when three or more consecutive failures occur
     *         for an environment.</li>
     *         <li> <code>Yellow</code>: Indicates that something is wrong.
     *         Occurs when two consecutive failures occur for an environment.</li>
     *         <li> <code>Green</code>: Indicates the environment is healthy and
     *         fully functional.</li>
     *         <li> <code>Grey</code>: Default health for a new environment. The
     *         environment is not fully launched and health checks have not
     *         started or health checks are suspended during an
     *         <code>UpdateEnvironment</code> or
     *         <code>RestartEnvironement</code> request.</li>
     *         </ul>
     *         <p>
     *         Default: <code>Grey</code>
     * @see EnvironmentHealth
     */

    public String getHealth() {
        return this.health;
    }

    /**
     * <p>
     * Describes the health status of the environment. AWS Elastic Beanstalk
     * indicates the failure levels for a running environment:
     * </p>
     * <ul>
     * <li> <code>Red</code>: Indicates the environment is not responsive. Occurs
     * when three or more consecutive failures occur for an environment.</li>
     * <li> <code>Yellow</code>: Indicates that something is wrong. Occurs when
     * two consecutive failures occur for an environment.</li>
     * <li> <code>Green</code>: Indicates the environment is healthy and fully
     * functional.</li>
     * <li> <code>Grey</code>: Default health for a new environment. The
     * environment is not fully launched and health checks have not started or
     * health checks are suspended during an <code>UpdateEnvironment</code> or
     * <code>RestartEnvironement</code> request.</li>
     * </ul>
     * <p>
     * Default: <code>Grey</code>
     * </p>
     * 
     * @param health
     *        Describes the health status of the environment. AWS Elastic
     *        Beanstalk indicates the failure levels for a running environment:
     *        </p>
     *        <ul>
     *        <li> <code>Red</code>: Indicates the environment is not responsive.
     *        Occurs when three or more consecutive failures occur for an
     *        environment.</li>
     *        <li> <code>Yellow</code>: Indicates that something is wrong. Occurs
     *        when two consecutive failures occur for an environment.</li>
     *        <li> <code>Green</code>: Indicates the environment is healthy and
     *        fully functional.</li>
     *        <li> <code>Grey</code>: Default health for a new environment. The
     *        environment is not fully launched and health checks have not
     *        started or health checks are suspended during an
     *        <code>UpdateEnvironment</code> or <code>RestartEnvironement</code>
     *        request.</li>
     *        </ul>
     *        <p>
     *        Default: <code>Grey</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EnvironmentHealth
     */

    public CreateEnvironmentResult withHealth(String health) {
        setHealth(health);
        return this;
    }

    /**
     * <p>
     * Describes the health status of the environment. AWS Elastic Beanstalk
     * indicates the failure levels for a running environment:
     * </p>
     * <ul>
     * <li> <code>Red</code>: Indicates the environment is not responsive. Occurs
     * when three or more consecutive failures occur for an environment.</li>
     * <li> <code>Yellow</code>: Indicates that something is wrong. Occurs when
     * two consecutive failures occur for an environment.</li>
     * <li> <code>Green</code>: Indicates the environment is healthy and fully
     * functional.</li>
     * <li> <code>Grey</code>: Default health for a new environment. The
     * environment is not fully launched and health checks have not started or
     * health checks are suspended during an <code>UpdateEnvironment</code> or
     * <code>RestartEnvironement</code> request.</li>
     * </ul>
     * <p>
     * Default: <code>Grey</code>
     * </p>
     * 
     * @param health
     *        Describes the health status of the environment. AWS Elastic
     *        Beanstalk indicates the failure levels for a running environment:
     *        </p>
     *        <ul>
     *        <li> <code>Red</code>: Indicates the environment is not responsive.
     *        Occurs when three or more consecutive failures occur for an
     *        environment.</li>
     *        <li> <code>Yellow</code>: Indicates that something is wrong. Occurs
     *        when two consecutive failures occur for an environment.</li>
     *        <li> <code>Green</code>: Indicates the environment is healthy and
     *        fully functional.</li>
     *        <li> <code>Grey</code>: Default health for a new environment. The
     *        environment is not fully launched and health checks have not
     *        started or health checks are suspended during an
     *        <code>UpdateEnvironment</code> or <code>RestartEnvironement</code>
     *        request.</li>
     *        </ul>
     *        <p>
     *        Default: <code>Grey</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EnvironmentHealth
     */

    public void setHealth(EnvironmentHealth health) {
        this.health = health.toString();
    }

    /**
     * <p>
     * Describes the health status of the environment. AWS Elastic Beanstalk
     * indicates the failure levels for a running environment:
     * </p>
     * <ul>
     * <li> <code>Red</code>: Indicates the environment is not responsive. Occurs
     * when three or more consecutive failures occur for an environment.</li>
     * <li> <code>Yellow</code>: Indicates that something is wrong. Occurs when
     * two consecutive failures occur for an environment.</li>
     * <li> <code>Green</code>: Indicates the environment is healthy and fully
     * functional.</li>
     * <li> <code>Grey</code>: Default health for a new environment. The
     * environment is not fully launched and health checks have not started or
     * health checks are suspended during an <code>UpdateEnvironment</code> or
     * <code>RestartEnvironement</code> request.</li>
     * </ul>
     * <p>
     * Default: <code>Grey</code>
     * </p>
     * 
     * @param health
     *        Describes the health status of the environment. AWS Elastic
     *        Beanstalk indicates the failure levels for a running environment:
     *        </p>
     *        <ul>
     *        <li> <code>Red</code>: Indicates the environment is not responsive.
     *        Occurs when three or more consecutive failures occur for an
     *        environment.</li>
     *        <li> <code>Yellow</code>: Indicates that something is wrong. Occurs
     *        when two consecutive failures occur for an environment.</li>
     *        <li> <code>Green</code>: Indicates the environment is healthy and
     *        fully functional.</li>
     *        <li> <code>Grey</code>: Default health for a new environment. The
     *        environment is not fully launched and health checks have not
     *        started or health checks are suspended during an
     *        <code>UpdateEnvironment</code> or <code>RestartEnvironement</code>
     *        request.</li>
     *        </ul>
     *        <p>
     *        Default: <code>Grey</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EnvironmentHealth
     */

    public CreateEnvironmentResult withHealth(EnvironmentHealth health) {
        setHealth(health);
        return this;
    }

    /**
     * <p>
     * Returns the health status of the application running in your environment.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     * 
     * @param healthStatus
     *        Returns the health status of the application running in your
     *        environment. For more information, see <a href=
     *        "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *        >Health Colors and Statuses</a>.
     * @see EnvironmentHealthStatus
     */

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * Returns the health status of the application running in your environment.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     * 
     * @return Returns the health status of the application running in your
     *         environment. For more information, see <a href=
     *         "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *         >Health Colors and Statuses</a>.
     * @see EnvironmentHealthStatus
     */

    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * <p>
     * Returns the health status of the application running in your environment.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     * 
     * @param healthStatus
     *        Returns the health status of the application running in your
     *        environment. For more information, see <a href=
     *        "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *        >Health Colors and Statuses</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EnvironmentHealthStatus
     */

    public CreateEnvironmentResult withHealthStatus(String healthStatus) {
        setHealthStatus(healthStatus);
        return this;
    }

    /**
     * <p>
     * Returns the health status of the application running in your environment.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     * 
     * @param healthStatus
     *        Returns the health status of the application running in your
     *        environment. For more information, see <a href=
     *        "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *        >Health Colors and Statuses</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EnvironmentHealthStatus
     */

    public void setHealthStatus(EnvironmentHealthStatus healthStatus) {
        this.healthStatus = healthStatus.toString();
    }

    /**
     * <p>
     * Returns the health status of the application running in your environment.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     * 
     * @param healthStatus
     *        Returns the health status of the application running in your
     *        environment. For more information, see <a href=
     *        "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *        >Health Colors and Statuses</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EnvironmentHealthStatus
     */

    public CreateEnvironmentResult withHealthStatus(
            EnvironmentHealthStatus healthStatus) {
        setHealthStatus(healthStatus);
        return this;
    }

    /**
     * <p>
     * The description of the AWS resources used by this environment.
     * </p>
     * 
     * @param resources
     *        The description of the AWS resources used by this environment.
     */

    public void setResources(EnvironmentResourcesDescription resources) {
        this.resources = resources;
    }

    /**
     * <p>
     * The description of the AWS resources used by this environment.
     * </p>
     * 
     * @return The description of the AWS resources used by this environment.
     */

    public EnvironmentResourcesDescription getResources() {
        return this.resources;
    }

    /**
     * <p>
     * The description of the AWS resources used by this environment.
     * </p>
     * 
     * @param resources
     *        The description of the AWS resources used by this environment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateEnvironmentResult withResources(
            EnvironmentResourcesDescription resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * Describes the current tier of this environment.
     * </p>
     * 
     * @param tier
     *        Describes the current tier of this environment.
     */

    public void setTier(EnvironmentTier tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * Describes the current tier of this environment.
     * </p>
     * 
     * @return Describes the current tier of this environment.
     */

    public EnvironmentTier getTier() {
        return this.tier;
    }

    /**
     * <p>
     * Describes the current tier of this environment.
     * </p>
     * 
     * @param tier
     *        Describes the current tier of this environment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateEnvironmentResult withTier(EnvironmentTier tier) {
        setTier(tier);
        return this;
    }

    /**
     * <p>
     * A list of links to other environments in the same group.
     * </p>
     * 
     * @return A list of links to other environments in the same group.
     */

    public java.util.List<EnvironmentLink> getEnvironmentLinks() {
        if (environmentLinks == null) {
            environmentLinks = new com.amazonaws.internal.SdkInternalList<EnvironmentLink>();
        }
        return environmentLinks;
    }

    /**
     * <p>
     * A list of links to other environments in the same group.
     * </p>
     * 
     * @param environmentLinks
     *        A list of links to other environments in the same group.
     */

    public void setEnvironmentLinks(
            java.util.Collection<EnvironmentLink> environmentLinks) {
        if (environmentLinks == null) {
            this.environmentLinks = null;
            return;
        }

        this.environmentLinks = new com.amazonaws.internal.SdkInternalList<EnvironmentLink>(
                environmentLinks);
    }

    /**
     * <p>
     * A list of links to other environments in the same group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setEnvironmentLinks(java.util.Collection)} or
     * {@link #withEnvironmentLinks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param environmentLinks
     *        A list of links to other environments in the same group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateEnvironmentResult withEnvironmentLinks(
            EnvironmentLink... environmentLinks) {
        if (this.environmentLinks == null) {
            setEnvironmentLinks(new com.amazonaws.internal.SdkInternalList<EnvironmentLink>(
                    environmentLinks.length));
        }
        for (EnvironmentLink ele : environmentLinks) {
            this.environmentLinks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of links to other environments in the same group.
     * </p>
     * 
     * @param environmentLinks
     *        A list of links to other environments in the same group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateEnvironmentResult withEnvironmentLinks(
            java.util.Collection<EnvironmentLink> environmentLinks) {
        setEnvironmentLinks(environmentLinks);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: " + getEnvironmentName() + ",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: " + getEnvironmentId() + ",");
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getVersionLabel() != null)
            sb.append("VersionLabel: " + getVersionLabel() + ",");
        if (getSolutionStackName() != null)
            sb.append("SolutionStackName: " + getSolutionStackName() + ",");
        if (getTemplateName() != null)
            sb.append("TemplateName: " + getTemplateName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getEndpointURL() != null)
            sb.append("EndpointURL: " + getEndpointURL() + ",");
        if (getCNAME() != null)
            sb.append("CNAME: " + getCNAME() + ",");
        if (getDateCreated() != null)
            sb.append("DateCreated: " + getDateCreated() + ",");
        if (getDateUpdated() != null)
            sb.append("DateUpdated: " + getDateUpdated() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getAbortableOperationInProgress() != null)
            sb.append("AbortableOperationInProgress: "
                    + getAbortableOperationInProgress() + ",");
        if (getHealth() != null)
            sb.append("Health: " + getHealth() + ",");
        if (getHealthStatus() != null)
            sb.append("HealthStatus: " + getHealthStatus() + ",");
        if (getResources() != null)
            sb.append("Resources: " + getResources() + ",");
        if (getTier() != null)
            sb.append("Tier: " + getTier() + ",");
        if (getEnvironmentLinks() != null)
            sb.append("EnvironmentLinks: " + getEnvironmentLinks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEnvironmentResult == false)
            return false;
        CreateEnvironmentResult other = (CreateEnvironmentResult) obj;
        if (other.getEnvironmentName() == null
                ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null
                && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null
                && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getApplicationName() == null
                ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null)
            return false;
        if (other.getVersionLabel() != null
                && other.getVersionLabel().equals(this.getVersionLabel()) == false)
            return false;
        if (other.getSolutionStackName() == null
                ^ this.getSolutionStackName() == null)
            return false;
        if (other.getSolutionStackName() != null
                && other.getSolutionStackName().equals(
                        this.getSolutionStackName()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEndpointURL() == null ^ this.getEndpointURL() == null)
            return false;
        if (other.getEndpointURL() != null
                && other.getEndpointURL().equals(this.getEndpointURL()) == false)
            return false;
        if (other.getCNAME() == null ^ this.getCNAME() == null)
            return false;
        if (other.getCNAME() != null
                && other.getCNAME().equals(this.getCNAME()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null
                && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getDateUpdated() == null ^ this.getDateUpdated() == null)
            return false;
        if (other.getDateUpdated() != null
                && other.getDateUpdated().equals(this.getDateUpdated()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAbortableOperationInProgress() == null
                ^ this.getAbortableOperationInProgress() == null)
            return false;
        if (other.getAbortableOperationInProgress() != null
                && other.getAbortableOperationInProgress().equals(
                        this.getAbortableOperationInProgress()) == false)
            return false;
        if (other.getHealth() == null ^ this.getHealth() == null)
            return false;
        if (other.getHealth() != null
                && other.getHealth().equals(this.getHealth()) == false)
            return false;
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null
                && other.getHealthStatus().equals(this.getHealthStatus()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null
                && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null
                && other.getTier().equals(this.getTier()) == false)
            return false;
        if (other.getEnvironmentLinks() == null
                ^ this.getEnvironmentLinks() == null)
            return false;
        if (other.getEnvironmentLinks() != null
                && other.getEnvironmentLinks().equals(
                        this.getEnvironmentLinks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEnvironmentName() == null) ? 0 : getEnvironmentName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEnvironmentId() == null) ? 0 : getEnvironmentId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getVersionLabel() == null) ? 0 : getVersionLabel()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSolutionStackName() == null) ? 0
                        : getSolutionStackName().hashCode());
        hashCode = prime
                * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getEndpointURL() == null) ? 0 : getEndpointURL().hashCode());
        hashCode = prime * hashCode
                + ((getCNAME() == null) ? 0 : getCNAME().hashCode());
        hashCode = prime
                * hashCode
                + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime
                * hashCode
                + ((getDateUpdated() == null) ? 0 : getDateUpdated().hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getAbortableOperationInProgress() == null) ? 0
                        : getAbortableOperationInProgress().hashCode());
        hashCode = prime * hashCode
                + ((getHealth() == null) ? 0 : getHealth().hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthStatus() == null) ? 0 : getHealthStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode
                + ((getTier() == null) ? 0 : getTier().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnvironmentLinks() == null) ? 0 : getEnvironmentLinks()
                        .hashCode());
        return hashCode;
    }

    @Override
    public CreateEnvironmentResult clone() {
        try {
            return (CreateEnvironmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
