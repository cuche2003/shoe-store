<%@page import="com.liferay.servicebuilder.model.Shoe" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ include file="/shoe/init.jsp" %>

<portlet:actionURL name="ShoeUpdate" var="ShoeUpdateURL" />

<h1>Shoe details:</h1>

<aui:form name="fm" action="${ShoeUpdateURL}">
	<aui:input name="shoeId" type="hidden" value="${shoe.getShoeId()}">
		<aui:validator name="required"/>
	</aui:input>
	<aui:input name="shoeModel" value="${shoe.getShoeModel()}" label="Model">
		<aui:validator name="required"/>
	</aui:input>
	<aui:select name="gender" value="${shoe.getGender()}" label="Gender">
		<aui:validator name="required"/>
 		<aui:option value="Men">Men</aui:option>
  		<aui:option value="Women">Women</aui:option>
	</aui:select>
	<aui:input name="size" value="${shoe.getSize()}" label="Size">
		<aui:validator name="required"/>
		<aui:validator name="number"/>
	</aui:input>
	<aui:select name="brandId" inlineField="${true}" value="${shoe.getBrandId()}" label="Brand">
		<aui:validator name="required"/>
		<c:forEach items="${ brands }" var="brand">
			<aui:option value="${brand.getBrandId()}">${brand.getName()}</aui:option>
		</c:forEach>
	</aui:select>
	<aui:select name="typeId" inlineField="${true}" value="${shoe.getTypeId()}" label="Brand">
		<aui:validator name="required"/>
		<c:forEach items="${ types }" var="type">
			<aui:option value="${brand.getTypeId()}">${type.getName()}</aui:option>
		</c:forEach>
	</aui:select>
	<aui:input name="price" value="${shoe.getPrice()}" label="Price">
		<aui:validator name="required"/>
		<aui:validator name="number"/>
	</aui:input>
	
	<aui:button-row>
		<aui:button cssClass="btn btn-primary" type="submit" value="Update Shoe"/>
	</aui:button-row>
</aui:form>