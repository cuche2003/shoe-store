<%@page import="com.liferay.servicebuilder.model.Brand" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ include file="/brand/init.jsp" %>

<portlet:actionURL name="BrandCreate" var="BrandCreateURL" />

<h1>Brand details:</h1>

<aui:form name="fm" action="${BrandCreateURL}">
	<aui:model-context bean="${brand}" model="<%= Brand.class %>" />
	<aui:input name="name">
		<aui:validator name="required"/>
	</aui:input>
	
	<aui:button-row>
		<aui:button type="submit" value="Create Brand"/>
	</aui:button-row>
</aui:form>