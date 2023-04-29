<%-- 
    Document   : instalacion
    Created on : 3/09/2022, 19:08:43
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="es_GT" />
<!DOCTYPE html>

<html lang="es">

    <head>
        <title>Instalaciones</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <link href="../assets/css/layout.css" rel="stylesheet" type="text/css" media="all">
    </head>
    <body id="top">



        <header id="header" class="hoc clear">
            <div id="logo" class="fl_left"> 

                <h1><a href="../index.html">Instalaciones</a></h1>

            </div>
            <nav id="mainav" class="fl_right"> 

                <ul class="clear">
                    <li class="active"><a href="../index">Inicio</a></li>
                    <li><a class="drop" href="#">Acerca De Nosotros</a>
                        <ul>
                            <li><a href="instalacion.jsp">Instalaciones</a></li>
                            <li><a href="../horarios/horario.jsp">Horarios</a></li>
                            <li><a href="../clubes-deportivos/club-deportivo.jsp">Clubes deportivos</a></li>
                            <li><a href="../instructores/instructor.jsp">Instructores</a></li>
                            <li><a href="../jugadores/jugador.jsp">Nuestros Jugadores</a></li>
                            <li><a href="../multas.jsp">Multas</a></li>
                        </ul>
                    </li>
                    <li><a class="drop" href="#">Forma Parte de Nuestras Filas</a>
                        <ul>


                            <li><a href="#">Inscribite</a></li>
                        </ul>

                </ul>

            </nav>
        </header>



        <div class="wrapper row3">
            <main class="hoc container clear"> 

                <div class="content"> 
<div class = "container mb-5 pb-5">
                            <div class="row">

                                <div class="col-12 col-md-9">

                                    <div class="card">
                                        <div class="card-header">
                                            <h4>Instalaciones</h4>
                                        </div>
                                    </div>

                                    <table class="table table-striped table-dark">
                                        <thead >
                                            <tr>
                                                <th>#</th>
                                                <th>Nombre de la Instalacion</th>
                                                <th>capacidad</th>
                                                <th>Pais</th>
                                                <th>Inauguracion</th>
                                                <th>Editar</th>
                                                <th>Eliminar</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach items="${data}" var="instalacion">
                                                <tr>
                                                    <td id="Tablai">${instalacion.id}</td>
                                                    <td id="Tablai">${instalacion.nombreInstalacion} </td>
                                                    <td id="Tablai">${instalacion.capacidad}</td>
                                                    <td id="Tablai">${instalacion.pais}</td>
                                                    <td id="Tablai">${instalacion.inauguracion}</td>
                                                    <td id="Tablai">
                                                        <i class="fa fa-edit"></i> editar
                                                    </td>                                                                                        
                                                    <td id="Tablai">
                                                        <i class="far fa-trash-alt"></i> eliminar
                                                    </td>


                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                </div>

                                <div class="col-12 col-md-3">



                                    <div class="card text-center bg-primary text-white mb-3">
                                        <div class="card-body">
                                            <h3>Total de Instalaciones</h3>
                                            <h4>11</h4>
                                        </div>
                                    </div>

                                </div>
                    <div id="gallery">
                        <figure>
                            <header class="heading">Nuestras Instalaciones</header>
                            <ul class="nospace clear">
                                <li class="one_quarter first"><a href="#"><img src="../assets/images/instalacion1.png" alt="Camp nou"></a></li>
                                <li class="one_quarter"><a href="#"><img src="../assets/images/instalacion2.png" alt="dassssssssssssssssssssssssssssssssssssssssssss"></a></li>
                                <li class="one_quarter"><a href="#"><img src="../assets/images/instalacion3.png" width="300px" height="225"  alt=""></a></li>
                                <li class="one_quarter"><a href="#"><img src="../assets/images/instalacion4.png" alt=""></a></li>
                                <li class="one_quarter first"><a href="#"><img src="../assets/images/instalacion5.png" alt=""></a></li>
                                <li class="one_quarter"><a href="#"><img src="../assets/images/instalacion6.png" alt=""></a></li>
                                <li class="one_quarter"><a href="#"><img src="../assets/images/instalacion7.png" alt=""></a></li>
                                <li class="one_quarter"><a href="#"><img src="../assets/images/instalacion8.png" alt=""></a></li>
                                <li class="one_quarter first"><a href="#"><img src="../assets/images/instalacion9.png" alt=""></a></li>
                                <li class="one_quarter"><a href="#"><img src="../assets/images/instalacion10.png" alt=""></a></li>
                                <li class="one_quarter"><a href="#"><img src="../assets/images/instalacion11.png" alt=""></a></li>

                            </ul>
                            <figcaption>Tenemos las mejores instalaciones de todos los clubes deportivos del mundo, queremos lo mejor para nuestros jugadores.
                                Lo mejor para los mejores.
                            </figcaption>
                        </figure>
                        <div id="comments">
                            <h2>Comentarios de algunos de nuestros ex jugadores a cerca de las instalaciones</h2>
                            <ul>
                                <li>
                                    <article>
                                        <header>
                                            <figure class="avatar"><img src="../images/demo/avatar.png" alt=""></figure>
                                            <address>
                                                By <a href="#">Donald Kuman</a>
                                            </address>
                                            <time datetime="2045-04-06T08:15+00:00">Viernes, 6<sup>th</sup> abril 2015 @08:15:00</time>
                                        </header>
                                        <div class="comcont">
                                            <p>Son muy grandes y todas estan en muy buen estado</p>
                                        </div>
                                    </article>
                                </li>
                                <li>
                                    <article>
                                        <header>
                                            <figure class="avatar"><img src="../images/demo/avatar.png" alt=""></figure>
                                            <address>
                                                By <a href="#">Henry Max</a>
                                            </address>
                                            <time datetime="2045-04-06T08:15+00:00">Jueves, 4<sup>th</sup> Junio 2020 @08:15:00</time>
                                        </header>
                                        <div class="comcont">
                                            <p>Siempre les dan mantenimiento y son muy espaciosas.</p>
                                        </div>
                                    </article>
                                </li>

                            </ul>


                        </div>
                        


                            </div>
                        </div>

                        <div class="clear"></div>
                        </main>
                    </div>


                    <div class="wrapper row1">
                        <section id="ctdetails" class="hoc clear"> 

                            <ul class="nospace clear">
                                <li class="one_quarter first">
                                    <div class="block clear"><a href="#"><i class="fas fa-phone"></i></a> <span><strong>Llamanos:</strong> +502 3224-4559</span></div>
                                </li>
                                <li class="one_quarter">
                                    <div class="block clear"><a href="#"><i class="fas fa-envelope"></i></a> <span><strong>Contactanos:</strong> Cbgarcia@gmail.com</span></div>
                                </li>
                                <li class="one_quarter">
                                    <div class="block clear"><a href="#"><i class="fas fa-clock"></i></a> <span><strong> Lun. - Sab.:</strong> 08.00am - 17.00pm</span></div>
                                </li>
                                <li class="one_quarter">
                                    <div class="block clear"><a href="#"><i class="fas fa-map-marker-alt"></i></a> <span><strong>Visitanos:</strong> 6A Avenida 13-54, Cdad. de Guatemala 01007 </span></div>
                                </li>
                            </ul>

                        </section>
                    </div>
                    <section >

                    </section>
                    <div class="wrapper row5">
                        <div id="copyright" class="hoc clear"> 

                            <p class="fl_left">Copyright &copy; 2022 - Grupo 4 Club Deportivo </p>


                        </div>
                    </div>

                    <a id="backtotop" href="#top"><i class="fas fa-chevron-up"></i></a>

                    <script src="../layout/scripts/jquery.min.js"></script>
                    <script src="../layout/scripts/jquery.backtotop.js"></script>
                    <script src="../layout/scripts/jquery.mobilemenu.js"></script>
                    </body>

                    </html>