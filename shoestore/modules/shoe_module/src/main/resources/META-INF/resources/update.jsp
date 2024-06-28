<%@page import="com.liferay.servicebuilder.model.Shoe" %>

<%@ include file="/init.jsp" %>

<portlet:actionURL name="updateShoe" var="updateShoeURL" />

<h1>Shoe details:</h1>

<aui:form name="fm" action="${updateShoeURL}">
	<aui:input name="shoeId" type="hidden" value="${shoe.getShoeId()}"></aui:input>
	<aui:input name="shoeModel" value="${shoe.getShoeModel()}"></aui:input>
	<aui:input name="gender" value="${shoe.getGender()}"></aui:input>
	<aui:input name="size" value="${shoe.getSize()}"></aui:input>
	<aui:input name="brandId" value="${shoe.getBrandId()}"></aui:input>
	<aui:input name="typeId" value="${shoe.getTypeId()}"></aui:input>
	<aui:input name="price"  value="${shoe.getPrice()}"></aui:input>
	
	<aui:button type="submit">Update Shoe</aui:button>
</aui:form>