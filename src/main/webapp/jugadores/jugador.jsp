<%-- 
    Document   : jugador
    Created on : 3/09/2022, 19:08:43
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="es">

    <head>
        <title>Nuestros Jugadores</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <link href="../assets/css/layout.css" rel="stylesheet" type="text/css" media="all">
    </head>
    <body id="top">

        <div class="bgded overlay padtop" style="background-image:url();"> 

            <header id="header" class="hoc clear">
                <div id="logo" class="fl_left"> 

                    <h1><a href="../index.html">Nuestros Jugadores</a></h1>

                </div>
                <nav id="mainav" class="fl_right"> 

                    <ul class="clear">
                        <li class="active"><a href="../index.jsp">Inicio</a></li>
                        <li><a class="drop" href="#">Acerca De Nosotros</a>
                            <ul>
                                <li><a href="../instalaciones/instalacion.jsp">Instalaciones</a></li>
                                <li><a href="../horarios/horario.jsp">Horarios</a></li>
                                <li><a href="../clubes-deportivos/club-deportivo.jsp">Clubes deportivos</a></li>
                                <li><a href="../instructores/instructor.jsp">Instructores</a></li>
                                <li><a href="jugador.jsp">Nuestros Jugadores</a></li>
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

        </div>



        <div class="wrapper row3">
            <main class="hoc container clear"> 

                <div class="content three_quarter first"> 

                    <h1>Nuestros Jugadores</h1>
                    <img class="imgr borderedbox inspace-5" src="../assets/images/equipo1.png" alt="">
                    <p>Tenemos a los mejores en nuestras filas, muchos de nuestros ex jugadores ya estan en europa cumpliendo su sueño de jugar en la elite, otros ya estan jugando en la NBA
                        y tu ¿Aun dudas de nuestro estilo de enseñar?
                    </p>


                    <p>Ven e inscribite si quieres ser una leyenda viva.
                    </p>

                    <div id="comments">
                        <h2>Comentarios de algunos de nuestros ex jugadores </h2>
                        <ul>
                            <li>
                                <article>
                                    <header>
                                        <figure class="avatar"><img src="../images/demo/avatar.png" alt=""></figure>
                                        <address>
                                            By <a href="#">Cristiano Ronaldo</a>
                                        </address>
                                        <time datetime="2045-04-06T08:15+00:00">Viernes, 6<sup>th</sup> abril 2015 @08:15:00</time>
                                    </header>
                                    <div class="comcont">
                                        <p>Les recomiendo mucho este club deportivo, es una de las mejores cosas que me han pasado.</p>
                                    </div>
                                </article>
                            </li>
                            <li>
                                <article>
                                    <header>
                                        <figure class="avatar"><img src="../images/demo/avatar.png" alt=""></figure>
                                        <address>
                                            By <a href="#">Luka Doncic</a>
                                        </address>
                                        <time datetime="2045-04-06T08:15+00:00">Jueves, 4<sup>th</sup> Junio 2020 @08:15:00</time>
                                    </header>
                                    <div class="comcont">
                                        <p>Haber estado en este club deportivo me abrio muchas puertas.</p>
                                    </div>
                                </article>
                            </li>

                        </ul>


                    </div>

                </div>

                </footer>
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
        <div class="wrapper row5">
            <div id="copyright" class="hoc clear"> 

                <p class="fl_left">Copyright &copy; 2022 - Grupo 4 Club Deportivo </p>
            </div>
        </div>

        <a id="backtotop" href="#top"><i class="fas fa-chevron-up"></i></a>
        <!-- JAVASCRIPTS -->
        <script src="../layout/scripts/jquery.min.js"></script>
        <script src="../layout/scripts/jquery.backtotop.js"></script>
        <script src="../layout/scripts/jquery.mobilemenu.js"></script>
    </body>
</html>