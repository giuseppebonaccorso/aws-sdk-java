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

package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class PreviewAgentsForResourceGroupRequest extends
        AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the resource group that is used to create an application.
     * </p>
     */
    private String resourceGroupArn;
    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this
     * parameter to 'null' on your first call to the
     * <b>PreviewAgentsForResourceGroup</b> action. Subsequent calls to the
     * action fill <b>nextToken</b> in the request with the value of
     * <b>NextToken</b> from previous response to continue listing data.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you
     * want in the response. The default value is 10. The maximum value is 500.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ARN of the resource group that is used to create an application.
     * </p>
     * 
     * @param resourceGroupArn
     *        The ARN of the resource group that is used to create an
     *        application.
     */

    public void setResourceGroupArn(String resourceGroupArn) {
        this.resourceGroupArn = resourceGroupArn;
    }

    /**
     * <p>
     * The ARN of the resource group that is used to create an application.
     * </p>
     * 
     * @return The ARN of the resource group that is used to create an
     *         application.
     */

    public String getResourceGroupArn() {
        return this.resourceGroupArn;
    }

    /**
     * <p>
     * The ARN of the resource group that is used to create an application.
     * </p>
     * 
     * @param resourceGroupArn
     *        The ARN of the resource group that is used to create an
     *        application.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PreviewAgentsForResourceGroupRequest withResourceGroupArn(
            String resourceGroupArn) {
        setResourceGroupArn(resourceGroupArn);
        return this;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this
     * parameter to 'null' on your first call to the
     * <b>PreviewAgentsForResourceGroup</b> action. Subsequent calls to the
     * action fill <b>nextToken</b> in the request with the value of
     * <b>NextToken</b> from previous response to continue listing data.
     * </p>
     * 
     * @param nextToken
     *        You can use this parameter when paginating results. Set the value
     *        of this parameter to 'null' on your first call to the
     *        <b>PreviewAgentsForResourceGroup</b> action. Subsequent calls to
     *        the action fill <b>nextToken</b> in the request with the value of
     *        <b>NextToken</b> from previous response to continue listing data.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this
     * parameter to 'null' on your first call to the
     * <b>PreviewAgentsForResourceGroup</b> action. Subsequent calls to the
     * action fill <b>nextToken</b> in the request with the value of
     * <b>NextToken</b> from previous response to continue listing data.
     * </p>
     * 
     * @return You can use this parameter when paginating results. Set the value
     *         of this parameter to 'null' on your first call to the
     *         <b>PreviewAgentsForResourceGroup</b> action. Subsequent calls to
     *         the action fill <b>nextToken</b> in the request with the value of
     *         <b>NextToken</b> from previous response to continue listing data.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this
     * parameter to 'null' on your first call to the
     * <b>PreviewAgentsForResourceGroup</b> action. Subsequent calls to the
     * action fill <b>nextToken</b> in the request with the value of
     * <b>NextToken</b> from previous response to continue listing data.
     * </p>
     * 
     * @param nextToken
     *        You can use this parameter when paginating results. Set the value
     *        of this parameter to 'null' on your first call to the
     *        <b>PreviewAgentsForResourceGroup</b> action. Subsequent calls to
     *        the action fill <b>nextToken</b> in the request with the value of
     *        <b>NextToken</b> from previous response to continue listing data.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PreviewAgentsForResourceGroupRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you
     * want in the response. The default value is 10. The maximum value is 500.
     * </p>
     * 
     * @param maxResults
     *        You can use this parameter to indicate the maximum number of items
     *        you want in the response. The default value is 10. The maximum
     *        value is 500.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you
     * want in the response. The default value is 10. The maximum value is 500.
     * </p>
     * 
     * @return You can use this parameter to indicate the maximum number of
     *         items you want in the response. The default value is 10. The
     *         maximum value is 500.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you
     * want in the response. The default value is 10. The maximum value is 500.
     * </p>
     * 
     * @param maxResults
     *        You can use this parameter to indicate the maximum number of items
     *        you want in the response. The default value is 10. The maximum
     *        value is 500.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PreviewAgentsForResourceGroupRequest withMaxResults(
            Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getResourceGroupArn() != null)
            sb.append("ResourceGroupArn: " + getResourceGroupArn() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PreviewAgentsForResourceGroupRequest == false)
            return false;
        PreviewAgentsForResourceGroupRequest other = (PreviewAgentsForResourceGroupRequest) obj;
        if (other.getResourceGroupArn() == null
                ^ this.getResourceGroupArn() == null)
            return false;
        if (other.getResourceGroupArn() != null
                && other.getResourceGroupArn().equals(
                        this.getResourceGroupArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getResourceGroupArn() == null) ? 0 : getResourceGroupArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public PreviewAgentsForResourceGroupRequest clone() {
        return (PreviewAgentsForResourceGroupRequest) super.clone();
    }
}