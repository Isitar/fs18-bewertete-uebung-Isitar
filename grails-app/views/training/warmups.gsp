<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>

    <title>Training zusammenstellen</title>
</head>

<body class="warmups">

<a href="training" class="btn btn-primary mt-1">Zurück</a>

<h2>Ausgewählte Techniken</h2>

<div id="accordion-techniques" role="list">
    <g:each in="${techniques}" var="technique">
        <div class="card">
            <div class="card-header"
                 id="head-technique-${technique.id}"
                 data-toggle="collapse"
                 data-target="#collapse-technique-${technique.id}"
                 aria-expanded="false"
                 aria-controls="collapse-technique-${technique.id}"
                 role="listitem">
                ${technique.name}
                <i class="fas fa-angle-down float-right"></i>
            </div>

            <div id="collapse-technique-${technique.id}" class="collapse"
                 aria-labelledby="head-technique-${technique.id}" data-parent="#accordion-techniques">
                <div class="card-body">
                    <dl class="row">
                        <dt class="col-sm-3">Technik Art</dt>
                        <dd class="col-sm-9">${message(code: technique.techniqueType, default: technique.techniqueType)}</dd>

                        <g:if test="${technique.ytLink != null && !technique.ytLink.equals('')}">
                            <dt class="col-sm-3">Youtube</dt>
                            <dd class="col-sm-9">
                                <a href="${technique.ytLink}">${technique.ytLink}<i class="fab fa-youtube"></i></a>
                            </dd>
                        </g:if>
                    </dl>
                </div>
            </div>
        </div>
    </g:each>
</div>

<h2>Aufwärm Übungen</h2>

<div id="accordion-warmups" role="list">
    <g:each in="${warmups}" var="warmup">
        <div class="card">
            <div class="card-header"
                 id="head-warmup-${warmup.id}"
                 data-toggle="collapse"
                 data-target="#collapse-warmup-${warmup.id}"
                 aria-expanded="false"
                 aria-controls="collapse-warmup-${warmup.id}"
                 role="listitem">
                ${warmup.name}
            </div>

            <div id="collapse-warmup-${warmup.id}" class="collapse" aria-labelledby="head-warmup-${warmup.id}"
                 data-parent="#accordion-warmups">
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
</body>