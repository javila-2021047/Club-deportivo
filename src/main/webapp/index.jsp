<%-- 
    Document   : index
    Created on : 3/09/2022, 19:01:24
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="es">
    <head>
        <title>Club deportivo Garcia</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <link href="./assets/css/layout.css" rel="stylesheet" type="text/css" media="all">
        <link href="./assets/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
    </head>
    <body id="top">


        <div class="bgded overlay padtop" style="background-image:url('./assets/images/imagen1.png');"> 

            <jsp:include page = "./WEB-INF/paginas/comunes/cabecera.jsp" />

            <div id="pageintro" class="hoc clear"> 

                <article>
                    <h3 class="heading">¿Quienes Somos?</h3>
                    <p>Somos el gran Club Deportivo Garcia, somos los mejores en lo que hacemos, nuestro lema: "El Trabajo Bien Hecho". 
                        Si quieres ser el mejor no dudes mas e incribete para formar parte de nuestras filas, si dudas de tu potencial ¡VETE! Solo queremos gente comprometida
                        a defender estos colores. Club Deportivo Garcia Historia Por Hacer..... </p>

                </article>
            </div>

        </div>

            <jsp:include page = "/WEB-INF/paginas/comunes/pie.jsp"/>
        <!-- JAVASCRIPTS -->
        <script src="./assets/js/jquery.min.js"></script>
        <script src="./WEB-INF/../assets/js/jquery.backtotop.js"></script>
        <script src="./assets/js/jquery.mobilemenu.js"></script>
        <script src="./assets/js/bootstrap.bundle.js"></script>
            
    </body>
</html>
