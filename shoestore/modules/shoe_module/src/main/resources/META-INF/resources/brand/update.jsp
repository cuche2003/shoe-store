<%@page import="com.liferay.servicebuilder.model.Shoe" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ include file="/shoe/init.jsp" %>

<portlet:actionURL name="BrandUpdate" var="BrandUpdateURL" />

<h1>Brand details:</h1>

<aui:form name="fm" action="${BrandUpdateURL}">
	<aui:input name="brandId" type="hidden" value="${brand.getBrandId()}"></aui:input>
	<aui:input name="name" value="${brand.getName()}">
		<aui:validator name="required"></aui:validator>
	</aui:input>
	
	<aui:button-row>
		<aui:button type="submit" value="Update Brand"/>
	</aui:button-row>
</aui:form>