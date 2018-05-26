<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>

    <title>Training zusammenstellen</title>
</head>

<body class="warmups">
<a href="index.gsp">Zurück</a>


<h2>Ausgewählte Techniken</h2>
<div id="accordion-techniques">

    <g:each in="${techniques}" var="technique">
        <div class="card">
            <div class="card-header" id="head-technique-${technique.id}">
                <button class="btn btn-primary" data-toggle="collapse" data-target="#collapse-technique-${technique.id}" aria-expanded="false" aria-controls="collapse-technique-${technique.id}">
                    ${technique.name}
                </button>
            </div>
            <div id="collapse-technique-${technique.id}" class="collapse" aria-labelledby="head-technique-${technique.id}" data-parent="#accordion-techniques">
                <div class="card-body">
                    ${technique.techniqueType}
                    <g:if test="${technique.ytLink != null && !technique.ytLink.equals('')}">
                        <a href="${technique.ytLink}"><i class="fab fa-youtube"></i></a>
                    </g:if>
                </div>
            </div>
        </div>
    </g:each>
</div>

<h2>Aufwärm Übungen</h2>
<div id="accordion-warmups">
    <g:each in="${warmups}" var="warmup">
        <div class="card">
            <div class="card-header" id="head-warmup-${warmup.id}">
                <button class="btn btn-link" data-toggle="collapse" data-target="#collapse-warmup-${warmup.id}" aria-expanded="false" aria-controls="collapse-warmup-${warmup.id}">
                    ${warmup.name}
                </button>
            </div>
            <div id="collapse-warmup-${warmup.id}" class="collapse" aria-labelledby="head-warmup-${warmup.id}" data-parent="#accordion-warmups">
                <div class="card-body">
                    ${warmup.description}
                    <g:if test="${warmup.ytLink != null && !warmup.ytLink.equals('')}">
                        <a href="${warmup.ytLink}"><i class="fab fa-youtube"></i></a>
                    </g:if>
                </div>
            </div>
        </div>
    </g:each>
</div>
    <g:each in="${warmups}" var="warmups">
        <li>${warmup.name}
            <g:if test="${warmup.ytLink != null && !warmup.ytLink.equals('')}">
                <a href="${warmup.ytLink}"><i class="fab fa-youtube"></i></a>
            </g:if>
        </li>
    </g:each>
</ul>
</body>