<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@page import="com.liferay.servicebuilder.service.BrandServiceUtil" %>
<%@page import="com.liferay.servicebuilder.service.ShoeLocalServiceUtil" %>
<%@page import="com.liferay.util.comparator.*" %>
<%@page import="com.liferay.portal.kernel.util.OrderByComparator" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>

<%@ include file="/shoe/init.jsp" %>

<%
String orderByCol = ParamUtil.getString(request, "orderByCol", "Model");
String orderByType = ParamUtil.getString(request, "orderByType", "asc");

OrderByComparator orderByComparator = 
	ShoeComparatorUtil.getShoeOrderByComparator(orderByCol, orderByType);
%>

<liferay-portlet:renderURL varImpl="ShoeViewURL">
    <portlet:param name="mvcPath" value="/shoe" />
    <portlet:param name="orderByCol" value="<%= orderByCol %>" />
    <portlet:param name="orderByType" value="<%= orderByType %>" />
</liferay-portlet:renderURL>

<portlet:renderURL var="ShoeCreateURL">
	<portlet:param name="mvcRenderCommandName" value="/shoe/create"/>
</portlet:renderURL>

<aui:a cssClass="btn btn-success" href="${ShoeCreateURL}">Create Shoe</aui:a>

<liferay-ui:search-container 
    id="shoeSearchContainer" delta="10"
	emptyResultsMessage="no-entries-were-found"
	total="${shoesCount}"
>
	<liferay-ui:search-container-results
		results="<%= ShoeLocalServiceUtil.getShoesSorted(
			searchContainer.getStart(), searchContainer.getEnd(), orderByComparator) %>"
	/>

	<liferay-ui:search-container-row
		className="com.liferay.servicebuilder.model.Shoe"
		keyProperty="shoeId" modelVar="entry" escapedModel="<%=true%>">
		
		<liferay-ui:search-container-column-text property="shoeModel" name="Model" orderable="<%= true %>"/>
		<liferay-ui:search-container-column-text name="Brand" 
			value="<%= entry.getBrand().getName() %>"
		/>
		<liferay-ui:search-container-column-text name="Type" 
			value="<%= entry.getType().getName() %>"
		/>
		<liferay-ui:search-container-column-text property="gender" />
		<liferay-ui:search-container-column-text property="size" />
		<liferay-ui:search-container-column-text property="price" orderableProperty="price" orderable="<%= true %>" />
		
		<liferay-ui:search-container-column-text name="Actions">
			<portlet:renderURL var="ShoeUpdateURL">
				<portlet:param name="mvcRenderCommandName" value="/shoe/update"/>
				<portlet:param name="shoeId" value="${entry.getShoeId()}" />
			</portlet:renderURL>
			<aui:a cssClass="btn btn-info" href="${ShoeUpdateURL}">Update</aui:a>
			<portlet:actionURL name="ShoeDelete" var="ShoeDeleteURL">
				<portlet:param name="shoeId" value="${entry.getShoeId()}" />
			</portlet:actionURL>
			<aui:a cssClass="btn btn-danger" href="${ShoeDeleteURL}" 
				onclick="return confirm('Are you sure you want to delete this shoe?');"
			>Delete</aui:a>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>		
	<liferay-ui:search-iterator />
</liferay-ui:search-container>