(function () {

    function onDomReady() {
        var output = document.getElementById('output');
        var entry = document.createElement('p');

        entry.classList.add('secondary');
        entry.innerText = 'second.js was loaded ... ';
        output.append(entry);
    }

    document.addEventListener('DOMContentLoaded', onDomReady, false);

}());