/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpledb;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.simpledb.model.*;

/**
 * Interface for accessing AmazonSimpleDB asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * Amazon SimpleDB <p>
 * Amazon SimpleDB is a web service providing the core database
 * functions of data indexing and querying in the cloud. By offloading
 * the time and effort associated with building and operating a web-scale
 * database, SimpleDB provides developers the freedom to focus on
 * application development.
 * </p>
 * <p>
 * A traditional, clustered relational database requires a sizable
 * upfront capital outlay, is complex to design, and often requires
 * extensive and repetitive database administration. Amazon SimpleDB is
 * dramatically simpler, requiring no schema, automatically indexing your
 * data and providing a simple API for storage and access. This approach
 * eliminates the administrative burden of data modeling, index
 * maintenance, and performance tuning. Developers gain access to this
 * functionality within Amazon's proven computing environment, are able
 * to scale instantly, and pay only for what they use.
 * </p>
 * <p>
 * Visit
 * <a href="http://aws.amazon.com/simpledb/"> http://aws.amazon.com/simpledb/ </a>
 * for more information.
 * </p>
 */
public interface AmazonSimpleDBAsync extends AmazonSimpleDB {
    /**
     * <p>
     * Performs multiple DeleteAttributes operations in a single call, which
     * reduces round trips and latencies. This enables Amazon SimpleDB to
     * optimize requests, which generally yields better throughput.
     * </p>
     * <p>
     * <b>NOTE:</b> If you specify BatchDeleteAttributes without attributes
     * or values, all the attributes for the item are deleted.
     * BatchDeleteAttributes is an idempotent operation; running it multiple
     * times on the same item or attribute doesn't result in an error. The
     * BatchDeleteAttributes operation succeeds or fails in its entirety.
     * There are no partial deletes. You can execute multiple
     * BatchDeleteAttributes operations and other operations in parallel.
     * However, large numbers of concurrent BatchDeleteAttributes calls can
     * result in Service Unavailable (503) responses. This operation is
     * vulnerable to exceeding the maximum URL size when making a REST
     * request using the HTTP GET method. This operation does not support
     * conditions using Expected.X.Name, Expected.X.Value, or
     * Expected.X.Exists.
     * </p>
     * <p>
     * The following limitations are enforced for this operation:
     * <ul>
     * <li>1 MB request size</li>
     * <li>25 item limit per BatchDeleteAttributes operation</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param batchDeleteAttributesRequest Container for the necessary
     *           parameters to execute the BatchDeleteAttributes operation on
     *           AmazonSimpleDB.
     * 
     * @return A Java Future object containing the response from the
     *         BatchDeleteAttributes service method, as returned by AmazonSimpleDB.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> batchDeleteAttributesAsync(BatchDeleteAttributesRequest batchDeleteAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Performs multiple DeleteAttributes operations in a single call, which
     * reduces round trips and latencies. This enables Amazon SimpleDB to
     * optimize requests, which generally yields better throughput.
     * </p>
     * <p>
     * <b>NOTE:</b> If you specify BatchDeleteAttributes without attributes
     * or values, all the attributes for the item are deleted.
     * BatchDeleteAttributes is an idempotent operation; running it multiple
     * times on the same item or attribute doesn't result in an error. The
     * BatchDeleteAttributes operation succeeds or fails in its entirety.
     * There are no partial deletes. You can execute multiple
     * BatchDeleteAttributes operations and other operations in parallel.
     * However, large numbers of concurrent BatchDeleteAttributes calls can
     * result in Service Unavailable (503) responses. This operation is
     * vulnerable to exceeding the maximum URL size when making a REST
     * request using the HTTP GET method. This operation does not support
     * conditions using Expected.X.Name, Expected.X.Value, or
     * Expected.X.Exists.
     * </p>
     * <p>
     * The following limitations are enforced for this operation:
     * <ul>
     * <li>1 MB request size</li>
     * <li>25 item limit per BatchDeleteAttributes operation</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param batchDeleteAttributesRequest Container for the necessary
     *           parameters to execute the BatchDeleteAttributes operation on
     *           AmazonSimpleDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         BatchDeleteAttributes service method, as returned by AmazonSimpleDB.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> batchDeleteAttributesAsync(BatchDeleteAttributesRequest batchDeleteAttributesRequest,
            AsyncHandler<BatchDeleteAttributesRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes one or more attributes associated with an item. If all
     * attributes of the item are deleted, the item is deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> If DeleteAttributes is called without being passed any
     * attributes or values specified, all the attributes for the item are
     * deleted.
     * </p>
     * <p>
     * <code>DeleteAttributes</code> is an idempotent operation; running it
     * multiple times on the same item or attribute does not result in an
     * error response.
     * </p>
     * <p>
     * Because Amazon SimpleDB makes multiple copies of item data and uses
     * an eventual consistency update model, performing a GetAttributes or
     * Select operation (read) immediately after a
     * <code>DeleteAttributes</code> or PutAttributes operation (write) might
     * not return updated item data.
     * </p>
     *
     * @param deleteAttributesRequest Container for the necessary parameters
     *           to execute the DeleteAttributes operation on AmazonSimpleDB.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAttributes service method, as returned by AmazonSimpleDB.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteAttributesAsync(DeleteAttributesRequest deleteAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes one or more attributes associated with an item. If all
     * attributes of the item are deleted, the item is deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> If DeleteAttributes is called without being passed any
     * attributes or values specified, all the attributes for the item are
     * deleted.
     * </p>
     * <p>
     * <code>DeleteAttributes</code> is an idempotent operation; running it
     * multiple times on the same item or attribute does not result in an
     * error response.
     * </p>
     * <p>
     * Because Amazon SimpleDB makes multiple copies of item data and uses
     * an eventual consistency update model, performing a GetAttributes or
     * Select operation (read) immediately after a
     * <code>DeleteAttributes</code> or PutAttributes operation (write) might
     * not return updated item data.
     * </p>
     *
     * @param deleteAttributesRequest Container for the necessary parameters
     *           to execute the DeleteAttributes operation on AmazonSimpleDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAttributes service method, as returned by AmazonSimpleDB.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteAttributesAsync(DeleteAttributesRequest deleteAttributesRequest,
            AsyncHandler<DeleteAttributesRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The PutAttributes operation creates or replaces attributes in an
     * item. The client may specify new attributes using a combination of the
     * <code>Attribute.X.Name</code> and <code>Attribute.X.Value</code>
     * parameters. The client specifies the first attribute by the parameters
     * <code>Attribute.0.Name</code> and <code>Attribute.0.Value</code> , the
     * second attribute by the parameters <code>Attribute.1.Name</code> and
     * <code>Attribute.1.Value</code> , and so on.
     * </p>
     * <p>
     * Attributes are uniquely identified in an item by their name/value
     * combination. For example, a single item can have the attributes
     * <code>{ "first_name", "first_value" }</code> and <code>{ "first_name",
     * second_value" }</code> . However, it cannot have two attribute
     * instances where both the <code>Attribute.X.Name</code> and
     * <code>Attribute.X.Value</code> are the same.
     * </p>
     * <p>
     * Optionally, the requestor can supply the <code>Replace</code>
     * parameter for each individual attribute. Setting this value to
     * <code>true</code> causes the new attribute value to replace the
     * existing attribute value(s). For example, if an item has the
     * attributes <code>{ 'a', '1' }</code> , <code>{ 'b', '2'}</code> and
     * <code>{ 'b', '3' }</code> and the requestor calls
     * <code>PutAttributes</code> using the attributes <code>{ 'b', '4'
     * }</code> with the <code>Replace</code> parameter set to true, the
     * final attributes of the item are changed to <code>{ 'a', '1' }</code>
     * and <code>{ 'b', '4' }</code> , which replaces the previous values of
     * the 'b' attribute with the new value.
     * </p>
     * <p>
     * <b>NOTE:</b> Using PutAttributes to replace attribute values that do
     * not exist will not result in an error response.
     * </p>
     * <p>
     * You cannot specify an empty string as an attribute name.
     * </p>
     * <p>
     * Because Amazon SimpleDB makes multiple copies of client data and uses
     * an eventual consistency update model, an immediate GetAttributes or
     * Select operation (read) immediately after a PutAttributes or
     * DeleteAttributes operation (write) might not return the updated data.
     * </p>
     * <p>
     * The following limitations are enforced for this operation:
     * <ul>
     * <li>256 total attribute name-value pairs per item</li>
     * <li>One billion attributes per domain</li>
     * <li>10 GB of total user data storage per domain</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param putAttributesRequest Container for the necessary parameters to
     *           execute the PutAttributes operation on AmazonSimpleDB.
     * 
     * @return A Java Future object containing the response from the
     *         PutAttributes service method, as returned by AmazonSimpleDB.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putAttributesAsync(PutAttributesRequest putAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The PutAttributes operation creates or replaces attributes in an
     * item. The client may specify new attributes using a combination of the
     * <code>Attribute.X.Name</code> and <code>Attribute.X.Value</code>
     * parameters. The client specifies the first attribute by the parameters
     * <code>Attribute.0.Name</code> and <code>Attribute.0.Value</code> , the
     * second attribute by the parameters <code>Attribute.1.Name</code> and
     * <code>Attribute.1.Value</code> , and so on.
     * </p>
     * <p>
     * Attributes are uniquely identified in an item by their name/value
     * combination. For example, a single item can have the attributes
     * <code>{ "first_name", "first_value" }</code> and <code>{ "first_name",
     * second_value" }</code> . However, it cannot have two attribute
     * instances where both the <code>Attribute.X.Name</code> and
     * <code>Attribute.X.Value</code> are the same.
     * </p>
     * <p>
     * Optionally, the requestor can supply the <code>Replace</code>
     * parameter for each individual attribute. Setting this value to
     * <code>true</code> causes the new attribute value to replace the
     * existing attribute value(s). For example, if an item has the
     * attributes <code>{ 'a', '1' }</code> , <code>{ 'b', '2'}</code> and
     * <code>{ 'b', '3' }</code> and the requestor calls
     * <code>PutAttributes</code> using the attributes <code>{ 'b', '4'
     * }</code> with the <code>Replace</code> parameter set to true, the
     * final attributes of the item are changed to <code>{ 'a', '1' }</code>
     * and <code>{ 'b', '4' }</code> , which replaces the previous values of
     * the 'b' attribute with the new value.
     * </p>
     * <p>
     * <b>NOTE:</b> Using PutAttributes to replace attribute values that do
     * not exist will not result in an error response.
     * </p>
     * <p>
     * You cannot specify an empty string as an attribute name.
     * </p>
     * <p>
     * Because Amazon SimpleDB makes multiple copies of client data and uses
     * an eventual consistency update model, an immediate GetAttributes or
     * Select operation (read) immediately after a PutAttributes or
     * DeleteAttributes operation (write) might not return the updated data.
     * </p>
     * <p>
     * The following limitations are enforced for this operation:
     * <ul>
     * <li>256 total attribute name-value pairs per item</li>
     * <li>One billion attributes per domain</li>
     * <li>10 GB of total user data storage per domain</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param putAttributesRequest Container for the necessary parameters to
     *           execute the PutAttributes operation on AmazonSimpleDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PutAttributes service method, as returned by AmazonSimpleDB.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putAttributesAsync(PutAttributesRequest putAttributesRequest,
            AsyncHandler<PutAttributesRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about the domain, including when the domain was
     * created, the number of items and attributes in the domain, and the
     * size of the attribute names and values.
     * </p>
     *
     * @param domainMetadataRequest Container for the necessary parameters to
     *           execute the DomainMetadata operation on AmazonSimpleDB.
     * 
     * @return A Java Future object containing the response from the
     *         DomainMetadata service method, as returned by AmazonSimpleDB.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DomainMetadataResult> domainMetadataAsync(DomainMetadataRequest domainMetadataRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about the domain, including when the domain was
     * created, the number of items and attributes in the domain, and the
     * size of the attribute names and values.
     * </p>
     *
     * @param domainMetadataRequest Container for the necessary parameters to
     *           execute the DomainMetadata operation on AmazonSimpleDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DomainMetadata service method, as returned by AmazonSimpleDB.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DomainMetadataResult> domainMetadataAsync(DomainMetadataRequest domainMetadataRequest,
            AsyncHandler<DomainMetadataRequest, DomainMetadataResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns all of the attributes associated with the specified item.
     * Optionally, the attributes returned can be limited to one or more
     * attributes by specifying an attribute name parameter.
     * </p>
     * <p>
     * If the item does not exist on the replica that was accessed for this
     * operation, an empty set is returned. The system does not return an
     * error as it cannot guarantee the item does not exist on other
     * replicas.
     * </p>
     * <p>
     * <b>NOTE:</b> If GetAttributes is called without being passed any
     * attribute names, all the attributes for the item are returned.
     * </p>
     *
     * @param getAttributesRequest Container for the necessary parameters to
     *           execute the GetAttributes operation on AmazonSimpleDB.
     * 
     * @return A Java Future object containing the response from the
     *         GetAttributes service method, as returned by AmazonSimpleDB.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetAttributesResult> getAttributesAsync(GetAttributesRequest getAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns all of the attributes associated with the specified item.
     * Optionally, the attributes returned can be limited to one or more
     * attributes by specifying an attribute name parameter.
     * </p>
     * <p>
     * If the item does not exist on the replica that was accessed for this
     * operation, an empty set is returned. The system does not return an
     * error as it cannot guarantee the item does not exist on other
     * replicas.
     * </p>
     * <p>
     * <b>NOTE:</b> If GetAttributes is called without being passed any
     * attribute names, all the attributes for the item are returned.
     * </p>
     *
     * @param getAttributesRequest Container for the necessary parameters to
     *           execute the GetAttributes operation on AmazonSimpleDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetAttributes service method, as returned by AmazonSimpleDB.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetAttributesResult> getAttributesAsync(GetAttributesRequest getAttributesRequest,
            AsyncHandler<GetAttributesRequest, GetAttributesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>ListDomains</code> operation lists all domains associated
     * with the Access Key ID. It returns domain names up to the limit set by
     * MaxNumberOfDomains. A NextToken is returned if there are more than
     * <code>MaxNumberOfDomains</code> domains. Calling
     * <code>ListDomains</code> successive times with the
     * <code>NextToken</code> provided by the operation returns up to
     * <code>MaxNumberOfDomains</code> more domain names with each successive
     * operation call.
     * </p>
     *
     * @param listDomainsRequest Container for the necessary parameters to
     *           execute the ListDomains operation on AmazonSimpleDB.
     * 
     * @return A Java Future object containing the response from the
     *         ListDomains service method, as returned by AmazonSimpleDB.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>ListDomains</code> operation lists all domains associated
     * with the Access Key ID. It returns domain names up to the limit set by
     * MaxNumberOfDomains. A NextToken is returned if there are more than
     * <code>MaxNumberOfDomains</code> domains. Calling
     * <code>ListDomains</code> successive times with the
     * <code>NextToken</code> provided by the operation returns up to
     * <code>MaxNumberOfDomains</code> more domain names with each successive
     * operation call.
     * </p>
     *
     * @param listDomainsRequest Container for the necessary parameters to
     *           execute the ListDomains operation on AmazonSimpleDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListDomains service method, as returned by AmazonSimpleDB.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest,
            AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>Select</code> operation returns a set of attributes for
     * <code>ItemNames</code> that match the select expression.
     * <code>Select</code> is similar to the standard SQL SELECT statement.
     * </p>
     * <p>
     * The total size of the response cannot exceed 1 MB in total size.
     * Amazon SimpleDB automatically adjusts the number of items returned per
     * page to enforce this limit. For example, if the client asks to
     * retrieve 2500 items, but each individual item is 10 kB in size, the
     * system returns 100 items and an appropriate <code>NextToken</code> so
     * the client can access the next page of results.
     * </p>
     * <p>
     * For information on how to construct select expressions, see Using
     * Select to Create Amazon SimpleDB Queries in the Developer Guide.
     * </p>
     *
     * @param selectRequest Container for the necessary parameters to execute
     *           the Select operation on AmazonSimpleDB.
     * 
     * @return A Java Future object containing the response from the Select
     *         service method, as returned by AmazonSimpleDB.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SelectResult> selectAsync(SelectRequest selectRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>Select</code> operation returns a set of attributes for
     * <code>ItemNames</code> that match the select expression.
     * <code>Select</code> is similar to the standard SQL SELECT statement.
     * </p>
     * <p>
     * The total size of the response cannot exceed 1 MB in total size.
     * Amazon SimpleDB automatically adjusts the number of items returned per
     * page to enforce this limit. For example, if the client asks to
     * retrieve 2500 items, but each individual item is 10 kB in size, the
     * system returns 100 items and an appropriate <code>NextToken</code> so
     * the client can access the next page of results.
     * </p>
     * <p>
     * For information on how to construct select expressions, see Using
     * Select to Create Amazon SimpleDB Queries in the Developer Guide.
     * </p>
     *
     * @param selectRequest Container for the necessary parameters to execute
     *           the Select operation on AmazonSimpleDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the Select
     *         service method, as returned by AmazonSimpleDB.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SelectResult> selectAsync(SelectRequest selectRequest,
            AsyncHandler<SelectRequest, SelectResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>DeleteDomain</code> operation deletes a domain. Any items
     * (and their attributes) in the domain are deleted as well. The
     * <code>DeleteDomain</code> operation might take 10 or more seconds to
     * complete.
     * </p>
     * <p>
     * <b>NOTE:</b> Running DeleteDomain on a domain that does not exist or
     * running the function multiple times using the same domain name will
     * not result in an error response.
     * </p>
     *
     * @param deleteDomainRequest Container for the necessary parameters to
     *           execute the DeleteDomain operation on AmazonSimpleDB.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDomain service method, as returned by AmazonSimpleDB.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>DeleteDomain</code> operation deletes a domain. Any items
     * (and their attributes) in the domain are deleted as well. The
     * <code>DeleteDomain</code> operation might take 10 or more seconds to
     * complete.
     * </p>
     * <p>
     * <b>NOTE:</b> Running DeleteDomain on a domain that does not exist or
     * running the function multiple times using the same domain name will
     * not result in an error response.
     * </p>
     *
     * @param deleteDomainRequest Container for the necessary parameters to
     *           execute the DeleteDomain operation on AmazonSimpleDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDomain service method, as returned by AmazonSimpleDB.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest,
            AsyncHandler<DeleteDomainRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>CreateDomain</code> operation creates a new domain. The
     * domain name should be unique among the domains associated with the
     * Access Key ID provided in the request. The <code>CreateDomain</code>
     * operation may take 10 or more seconds to complete.
     * </p>
     * <p>
     * <b>NOTE:</b> CreateDomain is an idempotent operation; running it
     * multiple times using the same domain name will not result in an error
     * response.
     * </p>
     * <p>
     * The client can create up to 100 domains per account.
     * </p>
     * <p>
     * If the client requires additional domains, go to
     * <a href="http://aws.amazon.com/contact-us/simpledb-limit-request/"> http://aws.amazon.com/contact-us/simpledb-limit-request/ </a>
     * .
     * </p>
     *
     * @param createDomainRequest Container for the necessary parameters to
     *           execute the CreateDomain operation on AmazonSimpleDB.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDomain service method, as returned by AmazonSimpleDB.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createDomainAsync(CreateDomainRequest createDomainRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>CreateDomain</code> operation creates a new domain. The
     * domain name should be unique among the domains associated with the
     * Access Key ID provided in the request. The <code>CreateDomain</code>
     * operation may take 10 or more seconds to complete.
     * </p>
     * <p>
     * <b>NOTE:</b> CreateDomain is an idempotent operation; running it
     * multiple times using the same domain name will not result in an error
     * response.
     * </p>
     * <p>
     * The client can create up to 100 domains per account.
     * </p>
     * <p>
     * If the client requires additional domains, go to
     * <a href="http://aws.amazon.com/contact-us/simpledb-limit-request/"> http://aws.amazon.com/contact-us/simpledb-limit-request/ </a>
     * .
     * </p>
     *
     * @param createDomainRequest Container for the necessary parameters to
     *           execute the CreateDomain operation on AmazonSimpleDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDomain service method, as returned by AmazonSimpleDB.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createDomainAsync(CreateDomainRequest createDomainRequest,
            AsyncHandler<CreateDomainRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>BatchPutAttributes</code> operation creates or replaces
     * attributes within one or more items. By using this operation, the
     * client can perform multiple PutAttribute operation with a single call.
     * This helps yield savings in round trips and latencies, enabling
     * Amazon SimpleDB to optimize requests and generally produce better
     * throughput.
     * </p>
     * <p>
     * The client may specify the item name with the
     * <code>Item.X.ItemName</code> parameter. The client may specify new
     * attributes using a combination of the
     * <code>Item.X.Attribute.Y.Name</code> and
     * <code>Item.X.Attribute.Y.Value</code> parameters. The client may
     * specify the first attribute for the first item using the parameters
     * <code>Item.0.Attribute.0.Name</code> and
     * <code>Item.0.Attribute.0.Value</code> , and for the second attribute
     * for the first item by the parameters
     * <code>Item.0.Attribute.1.Name</code> and
     * <code>Item.0.Attribute.1.Value</code> , and so on.
     * </p>
     * <p>
     * Attributes are uniquely identified within an item by their name/value
     * combination. For example, a single item can have the attributes
     * <code>{ "first_name", "first_value" }</code> and <code>{ "first_name",
     * "second_value" }</code> . However, it cannot have two attribute
     * instances where both the <code>Item.X.Attribute.Y.Name</code> and
     * <code>Item.X.Attribute.Y.Value</code> are the same.
     * </p>
     * <p>
     * Optionally, the requester can supply the <code>Replace</code>
     * parameter for each individual value. Setting this value to
     * <code>true</code> will cause the new attribute values to replace the
     * existing attribute values. For example, if an item <code>I</code> has
     * the attributes <code>{ 'a', '1' }, { 'b', '2'}</code> and <code>{ 'b',
     * '3' }</code> and the requester does a BatchPutAttributes of
     * <code>{'I', 'b', '4' }</code> with the Replace parameter set to true,
     * the final attributes of the item will be <code>{ 'a', '1' }</code> and
     * <code>{ 'b', '4' }</code> , replacing the previous values of the 'b'
     * attribute with the new value.
     * </p>
     * <p>
     * <b>NOTE:</b> You cannot specify an empty string as an item or as an
     * attribute name. The BatchPutAttributes operation succeeds or fails in
     * its entirety. There are no partial puts.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> This operation is vulnerable to exceeding the
     * maximum URL size when making a REST request using the HTTP GET method.
     * This operation does not support conditions using Expected.X.Name,
     * Expected.X.Value, or Expected.X.Exists.
     * </p>
     * <p>
     * You can execute multiple <code>BatchPutAttributes</code> operations
     * and other operations in parallel. However, large numbers of concurrent
     * <code>BatchPutAttributes</code> calls can result in Service
     * Unavailable (503) responses.
     * </p>
     * <p>
     * The following limitations are enforced for this operation:
     * <ul>
     * <li>256 attribute name-value pairs per item</li>
     * <li>1 MB request size</li>
     * <li>1 billion attributes per domain</li>
     * <li>10 GB of total user data storage per domain</li>
     * <li>25 item limit per <code>BatchPutAttributes</code> operation</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param batchPutAttributesRequest Container for the necessary
     *           parameters to execute the BatchPutAttributes operation on
     *           AmazonSimpleDB.
     * 
     * @return A Java Future object containing the response from the
     *         BatchPutAttributes service method, as returned by AmazonSimpleDB.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> batchPutAttributesAsync(BatchPutAttributesRequest batchPutAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <code>BatchPutAttributes</code> operation creates or replaces
     * attributes within one or more items. By using this operation, the
     * client can perform multiple PutAttribute operation with a single call.
     * This helps yield savings in round trips and latencies, enabling
     * Amazon SimpleDB to optimize requests and generally produce better
     * throughput.
     * </p>
     * <p>
     * The client may specify the item name with the
     * <code>Item.X.ItemName</code> parameter. The client may specify new
     * attributes using a combination of the
     * <code>Item.X.Attribute.Y.Name</code> and
     * <code>Item.X.Attribute.Y.Value</code> parameters. The client may
     * specify the first attribute for the first item using the parameters
     * <code>Item.0.Attribute.0.Name</code> and
     * <code>Item.0.Attribute.0.Value</code> , and for the second attribute
     * for the first item by the parameters
     * <code>Item.0.Attribute.1.Name</code> and
     * <code>Item.0.Attribute.1.Value</code> , and so on.
     * </p>
     * <p>
     * Attributes are uniquely identified within an item by their name/value
     * combination. For example, a single item can have the attributes
     * <code>{ "first_name", "first_value" }</code> and <code>{ "first_name",
     * "second_value" }</code> . However, it cannot have two attribute
     * instances where both the <code>Item.X.Attribute.Y.Name</code> and
     * <code>Item.X.Attribute.Y.Value</code> are the same.
     * </p>
     * <p>
     * Optionally, the requester can supply the <code>Replace</code>
     * parameter for each individual value. Setting this value to
     * <code>true</code> will cause the new attribute values to replace the
     * existing attribute values. For example, if an item <code>I</code> has
     * the attributes <code>{ 'a', '1' }, { 'b', '2'}</code> and <code>{ 'b',
     * '3' }</code> and the requester does a BatchPutAttributes of
     * <code>{'I', 'b', '4' }</code> with the Replace parameter set to true,
     * the final attributes of the item will be <code>{ 'a', '1' }</code> and
     * <code>{ 'b', '4' }</code> , replacing the previous values of the 'b'
     * attribute with the new value.
     * </p>
     * <p>
     * <b>NOTE:</b> You cannot specify an empty string as an item or as an
     * attribute name. The BatchPutAttributes operation succeeds or fails in
     * its entirety. There are no partial puts.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> This operation is vulnerable to exceeding the
     * maximum URL size when making a REST request using the HTTP GET method.
     * This operation does not support conditions using Expected.X.Name,
     * Expected.X.Value, or Expected.X.Exists.
     * </p>
     * <p>
     * You can execute multiple <code>BatchPutAttributes</code> operations
     * and other operations in parallel. However, large numbers of concurrent
     * <code>BatchPutAttributes</code> calls can result in Service
     * Unavailable (503) responses.
     * </p>
     * <p>
     * The following limitations are enforced for this operation:
     * <ul>
     * <li>256 attribute name-value pairs per item</li>
     * <li>1 MB request size</li>
     * <li>1 billion attributes per domain</li>
     * <li>10 GB of total user data storage per domain</li>
     * <li>25 item limit per <code>BatchPutAttributes</code> operation</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param batchPutAttributesRequest Container for the necessary
     *           parameters to execute the BatchPutAttributes operation on
     *           AmazonSimpleDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         BatchPutAttributes service method, as returned by AmazonSimpleDB.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> batchPutAttributesAsync(BatchPutAttributesRequest batchPutAttributesRequest,
            AsyncHandler<BatchPutAttributesRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        