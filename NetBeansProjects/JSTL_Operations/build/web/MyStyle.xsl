<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : MyStyle.xsl
    Created on : October 12, 2022, 11:06 AM
    Author     : Navod Madusanka
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
    <xsl:param name="color"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <title>MyStyle.xsl</title>
            </head>
            <body>
                <h1 style="color: ${color}" >Hello</h1>
                <xsl:apply-templates/>
            </body>
        </html>
    </xsl:template>
    <xsl:template match="users">
        <table border="2">
            <tr>
                <th>Name</th>
                <th>Email</th>
                <th>Address</th>
            </tr>
            <xsl:for-each select="user">
                <tr>
                    <td><xsl:value-of select="name"/></td>
                    <td><xsl:value-of select="email"/></td>
                    <td><xsl:value-of select="address"/></td>
                </tr>
            </xsl:for-each>
        </table>
    </xsl:template>

</xsl:stylesheet>
