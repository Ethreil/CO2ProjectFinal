google.charts.load('45', {
  //  callback: drawCO2Charts,
    packages:['corechart']
});




    function drawChart1() {

        var data = new google.visualization.DataTable();

        data.addColumn('string', 'Year');
        data.addColumn('number', 'CO2 Actual');
        data.addColumn('number', 'CO2 Projected');


        var year = 2019;
        var stringI;
        for (var i = 1959; i < year ; i = i + 4)
        {
           stringI = i.toString();
           data.addRow([stringI, dataPast[stringI], null ]);
        }

        data.addRow([year.toString(), dataPresent[year.toString()], dataPresent[year.toString()] ]);

        for (var i = year + 4; i < year + 50; i = i + 4) {
            stringI = i.toString();
            data.addRow([stringI, null, dataFutureAtCurrentRate[stringI] ]);
        }

        var options = {
            title: 'Carbon Dioxide (ppm) vs Time (Years) at Current Rate Of Change',
            curveType: 'function',
            legend: {position: 'bottom'},
            width: 900,
            height: 500,
            series :
                {
                    1: { lineDashStyle: [10, 2] }
                }
        };

        var chart = new google.visualization.LineChart(document.getElementById('linechart_'));

        chart.draw(data, options);

    }

    function drawChart2() {

        var data = new google.visualization.DataTable();

        data.addColumn('string', 'Year');
        data.addColumn('number', 'CO2 Actual');
        data.addColumn('number', 'CO2 Projected');


        var year = 2019;
        var stringI;
        for (var i = 1959; i < year ; i = i + 4)
        {
            stringI = i.toString();
            data.addRow([stringI, dataPast[stringI], null ]);
        }

        data.addRow([year.toString(), dataPresent[year.toString()], dataPresent[year.toString()] ]);

        for (var i = 2023; i < 2070; i = i + 4) {
            stringI = i.toString();
            data.addRow([stringI, null, dataFutureAtMinus5[stringI]]);
        }

        var options = {
            title: 'Carbon Dioxide (ppm) vs Time (Years) at Current Rate Of Change minus 5',
            curveType: 'function',
            legend: {position: 'bottom'},
            width: 900,
            height: 500,
            series :
                {
                    1: { lineDashStyle: [10, 2] }
                }
        };

        var chart = new google.visualization.LineChart(document.getElementById('linechart_'));

        chart.draw(data, options);

    }

    function drawChart3() {

        var data = new google.visualization.DataTable();

        data.addColumn('string', 'Year');
        data.addColumn('number', 'CO2 Actual');
        data.addColumn('number', 'CO2 Projected');


        var year = 2019;
        var stringI;
        for (var i = 1959; i < year ; i = i + 4)
        {
            stringI = i.toString();
            data.addRow([stringI, dataPast[stringI], null ]);
        }

        data.addRow([year.toString(), dataPresent[year.toString()], dataPresent[year.toString()] ]);

        for (var i = 2023; i < 2070; i = i + 4) {
            stringI = i.toString();
            data.addRow([stringI, null, dataFutureLastFiveDecade[stringI] ]);
        }

        var options = {
            title: 'Carbon Dioxide (ppm) vs Time (Years) at Rate of Change over last 5 decades',
            curveType: 'function',
            legend: {position: 'bottom'},
            width: 900,
            height: 500,
            series :
                {
                    1: { lineDashStyle: [10, 2] }
                }
        };

        var chart = new google.visualization.LineChart(document.getElementById('linechart_'));

        chart.draw(data, options);

    }



