<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>

    <title>Training zusammenstellen</title>
</head>

<body class="warmups">
<h2>selected techniques</h2>
<ul>
    <g:each in="${techniques}" var="technique">
        <li>${technique.name}</li>
    </g:each>
</ul>

<h2>warmups</h2>
<ul>
    <g:each in="${warmups}" var="warmup">
        <li>${warmup.name}</li>
    </g:each>
</ul>
</body>