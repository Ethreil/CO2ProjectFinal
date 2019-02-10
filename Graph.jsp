<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
  <html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);


      
      
      
      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Year', 'CO2'],
          ['1959',  <%= com.CarbonProject.Researcher.getAvgCO2("1959") %>],
          ['1961',  <%= com.CarbonProject.Researcher.getAvgCO2("1961") %>],
          ['1963',  <%= com.CarbonProject.Researcher.getAvgCO2("1963") %>],
          ['1965',  <%= com.CarbonProject.Researcher.getAvgCO2("1965") %>],
          ['1967',  <%= com.CarbonProject.Researcher.getAvgCO2("1967") %>],
          ['1969',  <%= com.CarbonProject.Researcher.getAvgCO2("1969") %>],
          ['1971',  <%= com.CarbonProject.Researcher.getAvgCO2("1971") %>],
          ['1973',  <%= com.CarbonProject.Researcher.getAvgCO2("1973") %>],
          ['1975',  <%= com.CarbonProject.Researcher.getAvgCO2("1975") %>],
          ['1977',  <%= com.CarbonProject.Researcher.getAvgCO2("1977") %>],
          ['1979',  <%= com.CarbonProject.Researcher.getAvgCO2("1979") %>],
          ['1981',  <%= com.CarbonProject.Researcher.getAvgCO2("1981") %>],
          ['1983',  <%= com.CarbonProject.Researcher.getAvgCO2("1983") %>],
          ['1985',  <%= com.CarbonProject.Researcher.getAvgCO2("1985") %>],
          ['1987',  <%= com.CarbonProject.Researcher.getAvgCO2("1987") %>],
          ['1989',  <%= com.CarbonProject.Researcher.getAvgCO2("1989") %>],
          ['1991',  <%= com.CarbonProject.Researcher.getAvgCO2("1991") %>],
          ['1993',  <%= com.CarbonProject.Researcher.getAvgCO2("1993") %>],
          ['1995',  <%= com.CarbonProject.Researcher.getAvgCO2("1995") %>],
          ['1997',  <%= com.CarbonProject.Researcher.getAvgCO2("1997") %>],
          ['1999',  <%= com.CarbonProject.Researcher.getAvgCO2("1999") %>],
          ['2001',  <%= com.CarbonProject.Researcher.getAvgCO2("2001") %>],
          ['2003',  <%= com.CarbonProject.Researcher.getAvgCO2("2003") %>],
          ['2005',  <%= com.CarbonProject.Researcher.getAvgCO2("2005") %>],
          ['2007',  <%= com.CarbonProject.Researcher.getAvgCO2("2007") %>],
          ['2009',  <%= com.CarbonProject.Researcher.getAvgCO2("2009") %>],
          ['2011',  <%= com.CarbonProject.Researcher.getAvgCO2("2011") %>],
          ['2013',  <%= com.CarbonProject.Researcher.getAvgCO2("2013") %>],
          ['2015',  <%= com.CarbonProject.Researcher.getAvgCO2("2015") %>],
          ['2017',  <%= com.CarbonProject.Researcher.getAvgCO2("2017") %>],
          ['2019',  <%= com.CarbonProject.Researcher.getCurrentCO2() %>],      
        ]);

        var options = {
          title: 'Carbon Dioxide (ppm) vs Time (Years)',
          curveType: 'function',
          legend: { position: 'bottom' }
        };

        var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));

        chart.draw(data, options);
      }
    </script>
  </head>
  <body>
    <div id="curve_chart" style="width: 900px; height: 500px"></div>
  </body>
</html>