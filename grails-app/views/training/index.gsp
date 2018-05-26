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
        <ul id="ul-unselected-techniques" class="list-group unselected-techniques" ondrop="dropUnselected(event)"
            ondragover="allowDrop(event)">
            <g:each in="${techniques}" var="technique">
                <li class="technique list-group-item"
                    data-technique-id="${technique.id}"
                    ondragstart="dragLi(event)"
                    draggable="true" id="${technique.id}"
                    onclick="clickLi(this)">
                    ${technique.name}
                    <g:if test="${technique.ytLink != null && !technique.ytLink.equals('')}">
                        <a href="${technique.ytLink}"><i class="fab fa-youtube"></i></a>
                    </g:if>
                </li>
            </g:each>
        </ul>
    </div>

    <div class="col-md-6 col-sm-12">
        <h2>Ausgewählte Techniken</h2>
        <ul class="list-group selected-techniques" id="ul-selected-techniques" ondrop="dropSelected(event)"
            ondragover="allowDrop(event)">

        </ul>
    </div>
</div>

<div class="row">
    <div class="col-12 pt-2">
        <button class="btn btn-block btn-primary btn-lg" id="btn-create-warmup"
                onclick="createWarmup()">Zusammenstellen</button>
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

    function clickLi(sender) {
        if (sender.localName === 'li') {
            var parentId = sender.parentElement.id;

            if (parentId === 'ul-unselected-techniques') {
                // select procedure
                newParent = document.getElementById('ul-selected-techniques');
                newParent.appendChild(sender);
            } else if (parentId === 'ul-selected-techniques') {
                // unselect procedure
                newParent = document.getElementById('ul-unselected-techniques');
                newParent.appendChild(sender);
            }
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

    function createWarmup() {
        var ids = [];
        var ul = document.getElementById('ul-selected-techniques');
        for (var child in ul.children) {
            try {
                ids.push(ul.children[child].attributes['data-technique-id'].value);
            } catch (e) {
                // child has no attribute or no data-technique-id
            }
        }


        $.ajax({
            type: 'POST',
            url: 'training/warmups',
            data: JSON.stringify(ids),
            contentType: "application/json; charset=utf-8",
            success: function (resp) {
                document.open();
                document.write(resp);
                document.close();
            },
            failure: function (errMsg) {
                alert(errMsg);
            }
        });
    }

</script>
</body>