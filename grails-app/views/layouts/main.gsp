<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Judo Trainingshelfer"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="JudoMan.ico" type="image/x-ico"/>

    <asset:stylesheet src="application.css"/>
    %{--font-awesome--}%
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp" crossorigin="anonymous">
    <g:layoutHead/>
</head>

<body class="${pageProperty(name: 'body.class')}">
<header class="navbar navbar-default navbar-static-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            %{--<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">--}%
            %{--<span class="sr-only">Toggle navigation</span>--}%
            %{--<span class="icon-bar"></span>--}%
            %{--<span class="icon-bar"></span>--}%
            %{--<span class="icon-bar"></span>--}%
            %{--</button>--}%
            <a class="navbar-brand" href="/#">
                <asset:image src="JudoMan.png" alt="Judo Man" style="max-width: 50px"/>
                Trainingshelfer
            </a>
        </div>
        %{--<div class="navbar-collapse collapse" aria-expanded="false" style="height: 0.8px;">--}%
        %{--<ul class="nav navbar-nav navbar-right">--}%
        %{--<g:pageProperty name="page.nav" />--}%
        %{--</ul>--}%
        %{--</div>--}%
    </div>
</header>

<g:layoutBody/>

<footer class="footer" role="contentinfo">
    Made by Pascal Lüscher
</footer>

<div id="spinner" class="spinner" style="display:none;">
    <g:message code="spinner.alt" default="Loading&hellip;"/>
</div>

<asset:javascript src="application.js"/>

</body>
</html>
