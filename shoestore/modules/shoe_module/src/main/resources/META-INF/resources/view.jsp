<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ taglib prefix="liferay-portlet" uri="http://liferay.com/tld/portlet" %>

<%@ include file="/init.jsp" %>

<p>
	helloworld
	<b><liferay-ui:message key="shoemodule.caption"/></b>
</p>
<portlet:renderURL var="createShoe">
	<portlet:param name="mvcRenderCommandName" value="/create"/>
</portlet:renderURL>

<liferay-ui:search-container delta="10"
	emptyResultsMessage="no-entries-were-found"
	total="${totalShoes}"
>
	<liferay-ui:search-container-results results="${entries}" />
		<liferay-ui:search-container-row
			className="com.liferay.servicebuilder.model.Shoe"
			keyProperty="shoeId" modelVar="entry" escapedModel="<%=true%>">
			
			<liferay-ui:search-container-column-text property="shoeModel" name="Model" />
			<liferay-ui:search-container-column-text property="brandId" name="Brand Id" />
			<liferay-ui:search-container-column-text property="typeId" name="Type Id" />
			<liferay-ui:search-container-column-text property="gender" />
			<liferay-ui:search-container-column-text property="size" />
			<liferay-ui:search-container-column-text property="price" />
			
			<liferay-ui:search-container-column-text>
				<portlet:renderURL var="updateShoe">
					<portlet:param name="mvcRenderCommandName" value="/update"/>
					<portlet:param name="shoeId" value="${entry.shoeId}" />
				</portlet:renderURL>
				<a href="${updateShoe}">Edit</a>
			</liferay-ui:search-container-column-text>
			
		</liferay-ui:search-container-row>		
	<liferay-ui:search-iterator />
</liferay-ui:search-container>

<a href="${createRender}">Create Shoe</a>