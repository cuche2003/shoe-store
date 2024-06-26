<%@page import="com.liferay.servicebuilder.model.Shoe" %>

<%@ include file="/init.jsp" %>

<portlet:actionURL name="createShoe" var="createShoeURL" />

<h1>Shoe details:</h1>

<aui:form name="fm" action="${createShoeURL}">
	<aui:model-context bean="${shoe}" model="<%= Shoe.class %>" />

	<aui:input name="shoeModel"></aui:input>
	<aui:input name="gender"></aui:input>
	<aui:input name="size"></aui:input>
	<aui:input name="brandId"></aui:input>
	<aui:input name="typeId"></aui:input>
	<aui:input name="price"></aui:input>
	
	<aui:button type="submit">Create Shoe</aui:button>
</aui:form>