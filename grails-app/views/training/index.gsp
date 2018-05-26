<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>

    <title>Training zusammenstellen</title>
</head>

<body class="training">

<div class="row">
    <div class="col-md-6 col-sm-12">
        <h2>Verfügbare Techniken</h2>
        <ul class="list-group unselected-techniques" ondrop="dropUnselected(event)" ondragover="allowDrop(event)">
            <g:each in="${techniques}" var="technique">
                <li class="technique list-group-item" data-technique-id="${technique.id}" ondragstart="dragLi(event)"
                    draggable="true" id="${technique.id}">${technique.name}</li>
            </g:each>
        </ul>
    </div>

    <div class="col-md-6 col-sm-12">
        <h2>Ausgewählte Techniken</h2>
        <ul class="list-group selected-techniques" ondrop="dropSelected(event)" ondragover="allowDrop(event)">

        </ul>
    </div>
</div>

<div class="row">
    <div class="col-12 pt-2">
        <button class="btn-block btn-primary">Zusammenstellen</button>
    </div>
</div>

<script>
    function allowDrop(event) {
        if (event.target.localName === 'ul') {
            event.preventDefault();
        }
    }

    function dragLi(event) {
        if (event.target.localName === 'li') {
            event.dataTransfer.setData("item", event.target.id);
        }

    }

    function dropSelected(event) {
        if (event.target.localName === 'ul') {
            event.preventDefault();
            var data = event.dataTransfer.getData("item");
            event.target.appendChild(document.getElementById(data));
        }
    }

    function dropUnselected(event) {
        if (event.target.localName === 'ul') {
            event.preventDefault();
            var data = event.dataTransfer.getData("item");
            event.target.appendChild(document.getElementById(data));
        }
    }

</script>
</body>