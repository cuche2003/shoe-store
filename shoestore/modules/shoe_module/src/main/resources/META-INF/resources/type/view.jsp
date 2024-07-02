<%@page import="com.liferay.portal.kernel.util.OrderByComparator" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ include file="/brand/init.jsp" %>

<portlet:renderURL var="TypeCreateURL">
	<portlet:param name="mvcRenderCommandName" value="/type/create"/>
</portlet:renderURL>

<aui:a cssClass="btn btn-success" href="${TypeCreateURL}">Create Type</aui:a>

<liferay-ui:search-container delta="10"
	emptyResultsMessage="no-entries-were-found"
	total="${totalTypes}"
>
	<liferay-ui:search-container-results results="${entries}" />
		<liferay-ui:search-container-row
			className="com.liferay.servicebuilder.model.Type"
			keyProperty="typeId" modelVar="entry" escapedModel="<%=true%>">
			
			<liferay-ui:search-container-column-text property="name"/>
			
			<liferay-ui:search-container-column-text name="Actions">
				<portlet:renderURL var="TypeUpdateURL">
					<portlet:param name="mvcRenderCommandName" value="/type/update"/>
					<portlet:param name="typeId" value="${entry.typeId}" />
				</portlet:renderURL>
				<aui:a cssClass="btn btn-info" href="${TypeUpdateURL}">Update</aui:a>
				<portlet:actionURL name="TypeDelete" var="TypeDeleteURL">
					<portlet:param name="typeId" value="${entry.typeId}" />
				</portlet:actionURL>
				<aui:a cssClass="btn btn-danger" href="${TypeDeleteURL}" 
				onclick="return confirm('Are you sure you want to delete this type?\n (This action will also delete all shoes associated with this type)');">Delete</aui:a>
			</liferay-ui:search-container-column-text>
		</liferay-ui:search-container-row>		
	<liferay-ui:search-iterator />
</liferay-ui:search-container>