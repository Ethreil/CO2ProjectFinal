google.charts.load('45', {
    callback: drawCO2Charts,
    packages:['corechart']
});

function drawCO2Charts () {

    function drawChart1() {

        var data = new google.visualization.DataTable();

        data.addColumn('string', 'Year');
        data.addColumn('number', 'CO2');

        var stringI;
        for (var i = 2023; i < 2070; i = i + 4) {
            stringI = i.toString();
            data.addRow([stringI, dataFutureAtCurrentRate[stringI]]);
        }

        var options = {
            title: 'Carbon Dioxide (ppm) vs Time (Years) at Current Rate Of Change',
            curveType: 'function',
            legend: {position: 'bottom'},
            width: 900,
            height: 500
        };

        var chart = new google.visualization.LineChart(document.getElementById('linechart_FutureAtCurrentRate'));

        chart.draw(data, options);

    }

    function drawChart2() {

        var data = new google.visualization.DataTable();

        data.addColumn('string', 'Year');
        data.addColumn('number', 'CO2');

        var stringI;
        for (var i = 2023; i < 2070; i = i + 4) {
            stringI = i.toString();
            data.addRow([stringI, dataFutureAtMinus5[stringI]]);
        }

        var options = {
            title: 'Carbon Dioxide (ppm) vs Time (Years) at Current Rate Of Change minus 5',
            curveType: 'function',
            legend: {position: 'bottom'},
            width: 900,
            height: 500
        };

        var chart = new google.visualization.LineChart(document.getElementById('linechart_FutureAtMinus5'));

        chart.draw(data, options);

    }

    function drawChart3() {

        var data = new google.visualization.DataTable();

        data.addColumn('string', 'Year');
        data.addColumn('number', 'CO2');

        var stringI;
        for (var i = 2023; i < 2070; i = i + 4) {
            stringI = i.toString();
            data.addRow([stringI, dataFutureLastFiveDecade[stringI]]);
        }

        var options = {
            title: 'Carbon Dioxide (ppm) vs Time (Years) at Rate of Change over last 5 decades',
            curveType: 'function',
            legend: {position: 'bottom'},
            width: 900,
            height: 500
        };

        var chart = new google.visualization.LineChart(document.getElementById('linechart_FutureAtRateLastFiveDecade'));

        chart.draw(data, options);

    }
    drawChart1();
    drawChart2();
    drawChart3();

}
