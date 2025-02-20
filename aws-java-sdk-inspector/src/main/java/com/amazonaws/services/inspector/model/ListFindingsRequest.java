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
public class ListFindingsRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The ARNs of the assessment runs that generate the findings that you want
     * to list.
     * </p>
     */
    private java.util.List<String> runArns;
    /**
     * <p>
     * You can use this parameter to specify a subset of data to be included in
     * the action's response.
     * </p>
     * <p>
     * For a record to match a filter, all specified filter attributes must
     * match. When multiple values are specified for a filter attribute, any of
     * the values can match.
     * </p>
     */
    private FindingsFilter filter;
    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this
     * parameter to 'null' on your first call to the <b>ListFindings</b> action.
     * Subsequent calls to the action fill <b>nextToken</b> in the request with
     * the value of <b>NextToken</b> from previous response to continue listing
     * data.
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
     * The ARNs of the assessment runs that generate the findings that you want
     * to list.
     * </p>
     * 
     * @return The ARNs of the assessment runs that generate the findings that
     *         you want to list.
     */

    public java.util.List<String> getRunArns() {
        return runArns;
    }

    /**
     * <p>
     * The ARNs of the assessment runs that generate the findings that you want
     * to list.
     * </p>
     * 
     * @param runArns
     *        The ARNs of the assessment runs that generate the findings that
     *        you want to list.
     */

    public void setRunArns(java.util.Collection<String> runArns) {
        if (runArns == null) {
            this.runArns = null;
            return;
        }

        this.runArns = new java.util.ArrayList<String>(runArns);
    }

    /**
     * <p>
     * The ARNs of the assessment runs that generate the findings that you want
     * to list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRunArns(java.util.Collection)} or
     * {@link #withRunArns(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param runArns
     *        The ARNs of the assessment runs that generate the findings that
     *        you want to list.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListFindingsRequest withRunArns(String... runArns) {
        if (this.runArns == null) {
            setRunArns(new java.util.ArrayList<String>(runArns.length));
        }
        for (String ele : runArns) {
            this.runArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs of the assessment runs that generate the findings that you want
     * to list.
     * </p>
     * 
     * @param runArns
     *        The ARNs of the assessment runs that generate the findings that
     *        you want to list.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListFindingsRequest withRunArns(java.util.Collection<String> runArns) {
        setRunArns(runArns);
        return this;
    }

    /**
     * <p>
     * You can use this parameter to specify a subset of data to be included in
     * the action's response.
     * </p>
     * <p>
     * For a record to match a filter, all specified filter attributes must
     * match. When multiple values are specified for a filter attribute, any of
     * the values can match.
     * </p>
     * 
     * @param filter
     *        You can use this parameter to specify a subset of data to be
     *        included in the action's response.</p>
     *        <p>
     *        For a record to match a filter, all specified filter attributes
     *        must match. When multiple values are specified for a filter
     *        attribute, any of the values can match.
     */

    public void setFilter(FindingsFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * You can use this parameter to specify a subset of data to be included in
     * the action's response.
     * </p>
     * <p>
     * For a record to match a filter, all specified filter attributes must
     * match. When multiple values are specified for a filter attribute, any of
     * the values can match.
     * </p>
     * 
     * @return You can use this parameter to specify a subset of data to be
     *         included in the action's response.</p>
     *         <p>
     *         For a record to match a filter, all specified filter attributes
     *         must match. When multiple values are specified for a filter
     *         attribute, any of the values can match.
     */

    public FindingsFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * You can use this parameter to specify a subset of data to be included in
     * the action's response.
     * </p>
     * <p>
     * For a record to match a filter, all specified filter attributes must
     * match. When multiple values are specified for a filter attribute, any of
     * the values can match.
     * </p>
     * 
     * @param filter
     *        You can use this parameter to specify a subset of data to be
     *        included in the action's response.</p>
     *        <p>
     *        For a record to match a filter, all specified filter attributes
     *        must match. When multiple values are specified for a filter
     *        attribute, any of the values can match.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListFindingsRequest withFilter(FindingsFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this
     * parameter to 'null' on your first call to the <b>ListFindings</b> action.
     * Subsequent calls to the action fill <b>nextToken</b> in the request with
     * the value of <b>NextToken</b> from previous response to continue listing
     * data.
     * </p>
     * 
     * @param nextToken
     *        You can use this parameter when paginating results. Set the value
     *        of this parameter to 'null' on your first call to the
     *        <b>ListFindings</b> action. Subsequent calls to the action fill
     *        <b>nextToken</b> in the request with the value of <b>NextToken</b>
     *        from previous response to continue listing data.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this
     * parameter to 'null' on your first call to the <b>ListFindings</b> action.
     * Subsequent calls to the action fill <b>nextToken</b> in the request with
     * the value of <b>NextToken</b> from previous response to continue listing
     * data.
     * </p>
     * 
     * @return You can use this parameter when paginating results. Set the value
     *         of this parameter to 'null' on your first call to the
     *         <b>ListFindings</b> action. Subsequent calls to the action fill
     *         <b>nextToken</b> in the request with the value of
     *         <b>NextToken</b> from previous response to continue listing data.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this
     * parameter to 'null' on your first call to the <b>ListFindings</b> action.
     * Subsequent calls to the action fill <b>nextToken</b> in the request with
     * the value of <b>NextToken</b> from previous response to continue listing
     * data.
     * </p>
     * 
     * @param nextToken
     *        You can use this parameter when paginating results. Set the value
     *        of this parameter to 'null' on your first call to the
     *        <b>ListFindings</b> action. Subsequent calls to the action fill
     *        <b>nextToken</b> in the request with the value of <b>NextToken</b>
     *        from previous response to continue listing data.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListFindingsRequest withNextToken(String nextToken) {
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

    public ListFindingsRequest withMaxResults(Integer maxResults) {
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
        if (getRunArns() != null)
            sb.append("RunArns: " + getRunArns() + ",");
        if (getFilter() != null)
            sb.append("Filter: " + getFilter() + ",");
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

        if (obj instanceof ListFindingsRequest == false)
            return false;
        ListFindingsRequest other = (ListFindingsRequest) obj;
        if (other.getRunArns() == null ^ this.getRunArns() == null)
            return false;
        if (other.getRunArns() != null
                && other.getRunArns().equals(this.getRunArns()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null
                && other.getFilter().equals(this.getFilter()) == false)
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

        hashCode = prime * hashCode
                + ((getRunArns() == null) ? 0 : getRunArns().hashCode());
        hashCode = prime * hashCode
                + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListFindingsRequest clone() {
        return (ListFindingsRequest) super.clone();
    }
}