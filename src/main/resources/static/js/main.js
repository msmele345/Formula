function loadAlgorithms () {

    this.source = null;

    this.start = function () {

        var algorithmTable = document.getElementById("algorithmResponses")

        this.source = new EventSource("http://localhost:8080/algorithm/stream");

        this.source.addEventListener("message", function (event) {

            console.log("DATA:");
            console.log(event.data);

            var algorithm = JSON.parse(event.data);
            console.log("PARSED:");
            console.log(algorithm);

            var row = algorithmTable.getElementsByTagName("tbody")[0].insertRow(0);
            var cell0 = row.insertCell(0);
            var cell1 = row.insertCell(1);
            var cell2 = row.insertCell(2);
            var cell3 = row.insertCell(3);
            var cell4 = row.insertCell(4);

            cell0.className = "name";
            cell0.innerHTML = algorithm.name;

            cell1.className = "codeSnippet";
            cell1.innerHTML = algorithm.codeSnippet;

            cell2.className = "categoryDescription";
            cell2.innerHTML = algorithm.categoryDescription;

            cell3.className = "difficultyLevel";
            cell3.innerHTML = algorithm.difficultyLevel;

            cell4.className = "isSolved";
            cell4.innerHTML = algorithm.isSolved;

            //... update somewhere

        });

        this.source.onerror = function () {
            this.close();
        };

    };

    this.stop = function() {
        this.source.close();
    }

}

comment = new loadAlgorithms();

window.onload = function() {
    comment.start();
};
window.onbeforeunload = function() {
    comment.stop();
}