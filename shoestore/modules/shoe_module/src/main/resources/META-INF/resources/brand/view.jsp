<%@page import="com.liferay.portal.kernel.util.OrderByComparator" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ include file="/brand/init.jsp" %>

<portlet:renderURL var="BrandCreateURL">
	<portlet:param name="mvcRenderCommandName" value="/brand/create"/>
</portlet:renderURL>

<aui:a cssClass="btn btn-success" href="${BrandCreateURL}">Create Brand</aui:a>

<liferay-ui:search-container delta="10"
	emptyResultsMessage="no-entries-were-found"
	total="${totalBrands}"
>
	<liferay-ui:search-container-results results="${entries}" />
		<liferay-ui:search-container-row
			className="com.liferay.servicebuilder.model.Brand"
			keyProperty="brandId" modelVar="entry" escapedModel="<%=true%>">
			
			<liferay-ui:search-container-column-text property="name"/>
			
			<liferay-ui:search-container-column-text name="Actions">
				<portlet:renderURL var="BrandUpdateURL">
					<portlet:param name="mvcRenderCommandName" value="/brand/update"/>
					<portlet:param name="brandId" value="${entry.brandId}" />
				</portlet:renderURL>
				<aui:a cssClass="btn btn-info" href="${BrandUpdateURL}">Update</aui:a>
				<portlet:actionURL name="BrandDelete" var="BrandDeleteURL">
					<portlet:param name="brandId" value="${entry.brandId}" />
				</portlet:actionURL>
				<aui:a cssClass="btn btn-danger" href="${BrandDeleteURL}" 
				onclick="return confirm('Are you sure you want to delete this brand?\n (This will also delete all shoes associated with the brand)');">Delete</aui:a>
			</liferay-ui:search-container-column-text>
		</liferay-ui:search-container-row>		
	<liferay-ui:search-iterator />
</liferay-ui:search-container>