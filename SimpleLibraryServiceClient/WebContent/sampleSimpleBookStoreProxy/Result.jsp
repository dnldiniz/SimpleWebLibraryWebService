<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleSimpleBookStoreProxyid" scope="session" class="br.mg.ufmg.icex.es2.SimpleBookStoreProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleSimpleBookStoreProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleSimpleBookStoreProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleSimpleBookStoreProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        br.mg.ufmg.icex.es2.SimpleBookStore getSimpleBookStore10mtemp = sampleSimpleBookStoreProxyid.getSimpleBookStore();
if(getSimpleBookStore10mtemp == null){
%>
<%=getSimpleBookStore10mtemp %>
<%
}else{
        if(getSimpleBookStore10mtemp!= null){
        String tempreturnp11 = getSimpleBookStore10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String isbn__1id=  request.getParameter("isbn_26");
        int isbn__1idTemp  = Integer.parseInt(isbn__1id);
        br.mg.ufmg.icex.es2.Livro pesquisaIsbn13mtemp = sampleSimpleBookStoreProxyid.pesquisaIsbn(isbn__1idTemp);
if(pesquisaIsbn13mtemp == null){
%>
<%=pesquisaIsbn13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">titulo:</TD>
<TD>
<%
if(pesquisaIsbn13mtemp != null){
java.lang.String typetitulo16 = pesquisaIsbn13mtemp.getTitulo();
        String tempResulttitulo16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetitulo16));
        %>
        <%= tempResulttitulo16 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">editora:</TD>
<TD>
<%
if(pesquisaIsbn13mtemp != null){
java.lang.String typeeditora18 = pesquisaIsbn13mtemp.getEditora();
        String tempResulteditora18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeeditora18));
        %>
        <%= tempResulteditora18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">isbn:</TD>
<TD>
<%
if(pesquisaIsbn13mtemp != null){
%>
<%=pesquisaIsbn13mtemp.getIsbn()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">autor:</TD>
<TD>
<%
if(pesquisaIsbn13mtemp != null){
java.lang.String typeautor22 = pesquisaIsbn13mtemp.getAutor();
        String tempResultautor22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeautor22));
        %>
        <%= tempResultautor22 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">ano:</TD>
<TD>
<%
if(pesquisaIsbn13mtemp != null){
%>
<%=pesquisaIsbn13mtemp.getAno()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 28:
        gotMethod = true;
        String autor__2id=  request.getParameter("autor_41");
            java.lang.String autor__2idTemp = null;
        if(!autor__2id.equals("")){
         autor__2idTemp  = autor__2id;
        }
        br.mg.ufmg.icex.es2.Livro pesquisaAutor28mtemp = sampleSimpleBookStoreProxyid.pesquisaAutor(autor__2idTemp);
if(pesquisaAutor28mtemp == null){
%>
<%=pesquisaAutor28mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">titulo:</TD>
<TD>
<%
if(pesquisaAutor28mtemp != null){
java.lang.String typetitulo31 = pesquisaAutor28mtemp.getTitulo();
        String tempResulttitulo31 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetitulo31));
        %>
        <%= tempResulttitulo31 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">editora:</TD>
<TD>
<%
if(pesquisaAutor28mtemp != null){
java.lang.String typeeditora33 = pesquisaAutor28mtemp.getEditora();
        String tempResulteditora33 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeeditora33));
        %>
        <%= tempResulteditora33 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">isbn:</TD>
<TD>
<%
if(pesquisaAutor28mtemp != null){
%>
<%=pesquisaAutor28mtemp.getIsbn()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">autor:</TD>
<TD>
<%
if(pesquisaAutor28mtemp != null){
java.lang.String typeautor37 = pesquisaAutor28mtemp.getAutor();
        String tempResultautor37 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeautor37));
        %>
        <%= tempResultautor37 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">ano:</TD>
<TD>
<%
if(pesquisaAutor28mtemp != null){
%>
<%=pesquisaAutor28mtemp.getAno()
%><%}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>