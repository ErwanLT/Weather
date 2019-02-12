package com.myApp.weather.utils;

public class FakeForecastUtils {

    public static final String fakeDarkSkyResponse = new StringBuilder().append(
            "{\n" +
                    "  \"latitude\": 37.8267,\n" +
                    "  \"longitude\": -122.4233,\n" +
                    "  \"timezone\": \"America/Los_Angeles\",\n" +
                    "  \"currently\": {\n" +
                    "    \"time\": 1548882106,\n" +
                    "    \"summary\": \"Partly Cloudy\",\n" +
                    "    \"icon\": \"partly-cloudy-day\",\n" +
                    "    \"nearestStormDistance\": 5,\n" +
                    "    \"nearestStormBearing\": 267,\n" +
                    "    \"precipIntensity\": 0,\n" +
                    "    \"precipProbability\": 0,\n" +
                    "    \"temperature\": 59.31,\n" +
                    "    \"apparentTemperature\": 59.31,\n" +
                    "    \"dewPoint\": 50.41,\n" +
                    "    \"humidity\": 0.72,\n" +
                    "    \"pressure\": 1012.66,\n" +
                    "    \"windSpeed\": 1.87,\n" +
                    "    \"windGust\": 5.86,\n" +
                    "    \"windBearing\": 183,\n" +
                    "    \"cloudCover\": 0.46,\n" +
                    "    \"uvIndex\": 3,\n" +
                    "    \"visibility\": 7.29,\n" +
                    "    \"ozone\": 297.22\n" +
                    "  },\n" +
                    "  \"hourly\": {\n" +
                    "    \"summary\": \"Rain starting this evening, continuing until tomorrow morning.\",\n" +
                    "    \"icon\": \"rain\",\n" +
                    "    \"data\": [\n" +
                    "      {\n" +
                    "        \"time\": 1548882000,\n" +
                    "        \"summary\": \"Partly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.001,\n" +
                    "        \"precipProbability\": 0.02,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 59.3,\n" +
                    "        \"apparentTemperature\": 59.3,\n" +
                    "        \"dewPoint\": 50.4,\n" +
                    "        \"humidity\": 0.72,\n" +
                    "        \"pressure\": 1012.69,\n" +
                    "        \"windSpeed\": 1.85,\n" +
                    "        \"windGust\": 5.87,\n" +
                    "        \"windBearing\": 182,\n" +
                    "        \"cloudCover\": 0.46,\n" +
                    "        \"uvIndex\": 3,\n" +
                    "        \"visibility\": 7.23,\n" +
                    "        \"ozone\": 297.18\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548885600,\n" +
                    "        \"summary\": \"Partly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperature\": 59.82,\n" +
                    "        \"apparentTemperature\": 59.82,\n" +
                    "        \"dewPoint\": 50.6,\n" +
                    "        \"humidity\": 0.72,\n" +
                    "        \"pressure\": 1011.65,\n" +
                    "        \"windSpeed\": 2.48,\n" +
                    "        \"windGust\": 5.54,\n" +
                    "        \"windBearing\": 190,\n" +
                    "        \"cloudCover\": 0.32,\n" +
                    "        \"uvIndex\": 2,\n" +
                    "        \"visibility\": 9.43,\n" +
                    "        \"ozone\": 298.42\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548889200,\n" +
                    "        \"summary\": \"Clear\",\n" +
                    "        \"icon\": \"clear-day\",\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperature\": 59.66,\n" +
                    "        \"apparentTemperature\": 59.66,\n" +
                    "        \"dewPoint\": 50.59,\n" +
                    "        \"humidity\": 0.72,\n" +
                    "        \"pressure\": 1010.81,\n" +
                    "        \"windSpeed\": 2.33,\n" +
                    "        \"windGust\": 4.35,\n" +
                    "        \"windBearing\": 190,\n" +
                    "        \"cloudCover\": 0.21,\n" +
                    "        \"uvIndex\": 1,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 299.37\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548892800,\n" +
                    "        \"summary\": \"Clear\",\n" +
                    "        \"icon\": \"clear-day\",\n" +
                    "        \"precipIntensity\": 0.0003,\n" +
                    "        \"precipProbability\": 0.04,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 59.52,\n" +
                    "        \"apparentTemperature\": 59.52,\n" +
                    "        \"dewPoint\": 50.78,\n" +
                    "        \"humidity\": 0.73,\n" +
                    "        \"pressure\": 1010.3,\n" +
                    "        \"windSpeed\": 3.24,\n" +
                    "        \"windGust\": 5.21,\n" +
                    "        \"windBearing\": 202,\n" +
                    "        \"cloudCover\": 0.21,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 300.61\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548896400,\n" +
                    "        \"summary\": \"Partly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0016,\n" +
                    "        \"precipProbability\": 0.09,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 58.88,\n" +
                    "        \"apparentTemperature\": 58.88,\n" +
                    "        \"dewPoint\": 51.12,\n" +
                    "        \"humidity\": 0.75,\n" +
                    "        \"pressure\": 1010.01,\n" +
                    "        \"windSpeed\": 3.58,\n" +
                    "        \"windGust\": 5.83,\n" +
                    "        \"windBearing\": 217,\n" +
                    "        \"cloudCover\": 0.36,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 302.55\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548900000,\n" +
                    "        \"summary\": \"Partly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.0078,\n" +
                    "        \"precipProbability\": 0.2,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 57.59,\n" +
                    "        \"apparentTemperature\": 57.59,\n" +
                    "        \"dewPoint\": 51.25,\n" +
                    "        \"humidity\": 0.79,\n" +
                    "        \"pressure\": 1010.02,\n" +
                    "        \"windSpeed\": 2.71,\n" +
                    "        \"windGust\": 5.85,\n" +
                    "        \"windBearing\": 229,\n" +
                    "        \"cloudCover\": 0.57,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 304.67\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548903600,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.0159,\n" +
                    "        \"precipProbability\": 0.28,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 56.85,\n" +
                    "        \"apparentTemperature\": 56.85,\n" +
                    "        \"dewPoint\": 51.13,\n" +
                    "        \"humidity\": 0.81,\n" +
                    "        \"pressure\": 1010.21,\n" +
                    "        \"windSpeed\": 2.73,\n" +
                    "        \"windGust\": 5.9,\n" +
                    "        \"windBearing\": 242,\n" +
                    "        \"cloudCover\": 0.8,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 306.58\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548907200,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.0226,\n" +
                    "        \"precipProbability\": 0.32,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 56.47,\n" +
                    "        \"apparentTemperature\": 56.47,\n" +
                    "        \"dewPoint\": 51.05,\n" +
                    "        \"humidity\": 0.82,\n" +
                    "        \"pressure\": 1010.4,\n" +
                    "        \"windSpeed\": 3.33,\n" +
                    "        \"windGust\": 6.6,\n" +
                    "        \"windBearing\": 214,\n" +
                    "        \"cloudCover\": 0.73,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 308.38\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548910800,\n" +
                    "        \"summary\": \"Light Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.0293,\n" +
                    "        \"precipProbability\": 0.46,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 55.89,\n" +
                    "        \"apparentTemperature\": 55.89,\n" +
                    "        \"dewPoint\": 51.17,\n" +
                    "        \"humidity\": 0.84,\n" +
                    "        \"pressure\": 1010.87,\n" +
                    "        \"windSpeed\": 1.51,\n" +
                    "        \"windGust\": 7.4,\n" +
                    "        \"windBearing\": 190,\n" +
                    "        \"cloudCover\": 0.83,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 309.83\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548914400,\n" +
                    "        \"summary\": \"Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.0792,\n" +
                    "        \"precipProbability\": 0.61,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 55.35,\n" +
                    "        \"apparentTemperature\": 55.35,\n" +
                    "        \"dewPoint\": 51.67,\n" +
                    "        \"humidity\": 0.87,\n" +
                    "        \"pressure\": 1011.05,\n" +
                    "        \"windSpeed\": 5.03,\n" +
                    "        \"windGust\": 8.38,\n" +
                    "        \"windBearing\": 279,\n" +
                    "        \"cloudCover\": 0.9,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 8.7,\n" +
                    "        \"ozone\": 309.85\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548918000,\n" +
                    "        \"summary\": \"Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.0812,\n" +
                    "        \"precipProbability\": 0.69,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 54.78,\n" +
                    "        \"apparentTemperature\": 54.78,\n" +
                    "        \"dewPoint\": 51.94,\n" +
                    "        \"humidity\": 0.9,\n" +
                    "        \"pressure\": 1011.05,\n" +
                    "        \"windSpeed\": 2.39,\n" +
                    "        \"windGust\": 8.35,\n" +
                    "        \"windBearing\": 211,\n" +
                    "        \"cloudCover\": 0.88,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 7.57,\n" +
                    "        \"ozone\": 307.83\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548921600,\n" +
                    "        \"summary\": \"Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.0854,\n" +
                    "        \"precipProbability\": 0.68,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 54.53,\n" +
                    "        \"apparentTemperature\": 54.53,\n" +
                    "        \"dewPoint\": 51.92,\n" +
                    "        \"humidity\": 0.91,\n" +
                    "        \"pressure\": 1011.02,\n" +
                    "        \"windSpeed\": 1.92,\n" +
                    "        \"windGust\": 6.78,\n" +
                    "        \"windBearing\": 123,\n" +
                    "        \"cloudCover\": 0.86,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 6.55,\n" +
                    "        \"ozone\": 304.37\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548925200,\n" +
                    "        \"summary\": \"Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.095,\n" +
                    "        \"precipProbability\": 0.62,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 54.56,\n" +
                    "        \"apparentTemperature\": 54.56,\n" +
                    "        \"dewPoint\": 51.8,\n" +
                    "        \"humidity\": 0.9,\n" +
                    "        \"pressure\": 1010.84,\n" +
                    "        \"windSpeed\": 4.47,\n" +
                    "        \"windGust\": 7.62,\n" +
                    "        \"windBearing\": 35,\n" +
                    "        \"cloudCover\": 0.77,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 6.63,\n" +
                    "        \"ozone\": 300.44\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548928800,\n" +
                    "        \"summary\": \"Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.0598,\n" +
                    "        \"precipProbability\": 0.59,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 54.66,\n" +
                    "        \"apparentTemperature\": 54.66,\n" +
                    "        \"dewPoint\": 51.72,\n" +
                    "        \"humidity\": 0.9,\n" +
                    "        \"pressure\": 1010.93,\n" +
                    "        \"windSpeed\": 4.63,\n" +
                    "        \"windGust\": 8.29,\n" +
                    "        \"windBearing\": 73,\n" +
                    "        \"cloudCover\": 0.78,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 6.87,\n" +
                    "        \"ozone\": 295.97\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548932400,\n" +
                    "        \"summary\": \"Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.0535,\n" +
                    "        \"precipProbability\": 0.53,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 54.99,\n" +
                    "        \"apparentTemperature\": 54.99,\n" +
                    "        \"dewPoint\": 51.42,\n" +
                    "        \"humidity\": 0.88,\n" +
                    "        \"pressure\": 1011.03,\n" +
                    "        \"windSpeed\": 3.91,\n" +
                    "        \"windGust\": 5.59,\n" +
                    "        \"windBearing\": 69,\n" +
                    "        \"cloudCover\": 0.8,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 7.74,\n" +
                    "        \"ozone\": 290.97\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548936000,\n" +
                    "        \"summary\": \"Light Rain\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"precipIntensity\": 0.0342,\n" +
                    "        \"precipProbability\": 0.46,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 54.92,\n" +
                    "        \"apparentTemperature\": 54.92,\n" +
                    "        \"dewPoint\": 51.32,\n" +
                    "        \"humidity\": 0.88,\n" +
                    "        \"pressure\": 1011.22,\n" +
                    "        \"windSpeed\": 3.69,\n" +
                    "        \"windGust\": 5.79,\n" +
                    "        \"windBearing\": 76,\n" +
                    "        \"cloudCover\": 0.72,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 8.55,\n" +
                    "        \"ozone\": 286.75\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548939600,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.017,\n" +
                    "        \"precipProbability\": 0.32,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 54.49,\n" +
                    "        \"apparentTemperature\": 54.49,\n" +
                    "        \"dewPoint\": 51.05,\n" +
                    "        \"humidity\": 0.88,\n" +
                    "        \"pressure\": 1011.32,\n" +
                    "        \"windSpeed\": 3.68,\n" +
                    "        \"windGust\": 5.05,\n" +
                    "        \"windBearing\": 53,\n" +
                    "        \"cloudCover\": 0.7,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 9.95,\n" +
                    "        \"ozone\": 283.77\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548943200,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.0053,\n" +
                    "        \"precipProbability\": 0.2,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 53.99,\n" +
                    "        \"apparentTemperature\": 53.99,\n" +
                    "        \"dewPoint\": 50.73,\n" +
                    "        \"humidity\": 0.89,\n" +
                    "        \"pressure\": 1011.42,\n" +
                    "        \"windSpeed\": 2.82,\n" +
                    "        \"windGust\": 3.97,\n" +
                    "        \"windBearing\": 329,\n" +
                    "        \"cloudCover\": 0.69,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 281.48\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548946800,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.0019,\n" +
                    "        \"precipProbability\": 0.17,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 53.68,\n" +
                    "        \"apparentTemperature\": 53.68,\n" +
                    "        \"dewPoint\": 50.53,\n" +
                    "        \"humidity\": 0.89,\n" +
                    "        \"pressure\": 1011.64,\n" +
                    "        \"windSpeed\": 3.3,\n" +
                    "        \"windGust\": 3.6,\n" +
                    "        \"windBearing\": 283,\n" +
                    "        \"cloudCover\": 0.68,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 278.89\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548950400,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0017,\n" +
                    "        \"precipProbability\": 0.16,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 53.77,\n" +
                    "        \"apparentTemperature\": 53.77,\n" +
                    "        \"dewPoint\": 50.56,\n" +
                    "        \"humidity\": 0.89,\n" +
                    "        \"pressure\": 1012.14,\n" +
                    "        \"windSpeed\": 2.94,\n" +
                    "        \"windGust\": 3.54,\n" +
                    "        \"windBearing\": 320,\n" +
                    "        \"cloudCover\": 0.68,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 275.47\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548954000,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0032,\n" +
                    "        \"precipProbability\": 0.15,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 54.15,\n" +
                    "        \"apparentTemperature\": 54.15,\n" +
                    "        \"dewPoint\": 50.71,\n" +
                    "        \"humidity\": 0.88,\n" +
                    "        \"pressure\": 1012.77,\n" +
                    "        \"windSpeed\": 1.6,\n" +
                    "        \"windGust\": 3.64,\n" +
                    "        \"windBearing\": 57,\n" +
                    "        \"cloudCover\": 0.68,\n" +
                    "        \"uvIndex\": 1,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 271.68\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548957600,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0048,\n" +
                    "        \"precipProbability\": 0.15,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 54.29,\n" +
                    "        \"apparentTemperature\": 54.29,\n" +
                    "        \"dewPoint\": 50.89,\n" +
                    "        \"humidity\": 0.88,\n" +
                    "        \"pressure\": 1013.2,\n" +
                    "        \"windSpeed\": 3.11,\n" +
                    "        \"windGust\": 3.92,\n" +
                    "        \"windBearing\": 302,\n" +
                    "        \"cloudCover\": 0.68,\n" +
                    "        \"uvIndex\": 2,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 268.63\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548961200,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0039,\n" +
                    "        \"precipProbability\": 0.14,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 54.76,\n" +
                    "        \"apparentTemperature\": 54.76,\n" +
                    "        \"dewPoint\": 51.06,\n" +
                    "        \"humidity\": 0.87,\n" +
                    "        \"pressure\": 1013.3,\n" +
                    "        \"windSpeed\": 1.99,\n" +
                    "        \"windGust\": 3.92,\n" +
                    "        \"windBearing\": 302,\n" +
                    "        \"cloudCover\": 0.68,\n" +
                    "        \"uvIndex\": 2,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 266.78\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548964800,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0023,\n" +
                    "        \"precipProbability\": 0.11,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 55.42,\n" +
                    "        \"apparentTemperature\": 55.42,\n" +
                    "        \"dewPoint\": 51.28,\n" +
                    "        \"humidity\": 0.86,\n" +
                    "        \"pressure\": 1013.21,\n" +
                    "        \"windSpeed\": 2.34,\n" +
                    "        \"windGust\": 3.85,\n" +
                    "        \"windBearing\": 251,\n" +
                    "        \"cloudCover\": 0.68,\n" +
                    "        \"uvIndex\": 3,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 265.54\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548968400,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0013,\n" +
                    "        \"precipProbability\": 0.06,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 56.17,\n" +
                    "        \"apparentTemperature\": 56.17,\n" +
                    "        \"dewPoint\": 51.5,\n" +
                    "        \"humidity\": 0.84,\n" +
                    "        \"pressure\": 1013.04,\n" +
                    "        \"windSpeed\": 2.81,\n" +
                    "        \"windGust\": 4,\n" +
                    "        \"windBearing\": 259,\n" +
                    "        \"cloudCover\": 0.66,\n" +
                    "        \"uvIndex\": 3,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 264.24\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548972000,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0006,\n" +
                    "        \"precipProbability\": 0.03,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 57.46,\n" +
                    "        \"apparentTemperature\": 57.46,\n" +
                    "        \"dewPoint\": 51.72,\n" +
                    "        \"humidity\": 0.81,\n" +
                    "        \"pressure\": 1012.75,\n" +
                    "        \"windSpeed\": 2.07,\n" +
                    "        \"windGust\": 4.57,\n" +
                    "        \"windBearing\": 267,\n" +
                    "        \"cloudCover\": 0.62,\n" +
                    "        \"uvIndex\": 2,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 262.62\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548975600,\n" +
                    "        \"summary\": \"Partly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0002,\n" +
                    "        \"precipProbability\": 0.02,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 58.6,\n" +
                    "        \"apparentTemperature\": 58.6,\n" +
                    "        \"dewPoint\": 51.93,\n" +
                    "        \"humidity\": 0.78,\n" +
                    "        \"pressure\": 1012.35,\n" +
                    "        \"windSpeed\": 3.33,\n" +
                    "        \"windGust\": 5.32,\n" +
                    "        \"windBearing\": 139,\n" +
                    "        \"cloudCover\": 0.56,\n" +
                    "        \"uvIndex\": 1,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 260.97\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548979200,\n" +
                    "        \"summary\": \"Partly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperature\": 59.1,\n" +
                    "        \"apparentTemperature\": 59.1,\n" +
                    "        \"dewPoint\": 51.97,\n" +
                    "        \"humidity\": 0.77,\n" +
                    "        \"pressure\": 1012.14,\n" +
                    "        \"windSpeed\": 4.04,\n" +
                    "        \"windGust\": 5.88,\n" +
                    "        \"windBearing\": 141,\n" +
                    "        \"cloudCover\": 0.51,\n" +
                    "        \"uvIndex\": 1,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 259.28\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548982800,\n" +
                    "        \"summary\": \"Partly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperature\": 58.73,\n" +
                    "        \"apparentTemperature\": 58.73,\n" +
                    "        \"dewPoint\": 51.82,\n" +
                    "        \"humidity\": 0.78,\n" +
                    "        \"pressure\": 1012.25,\n" +
                    "        \"windSpeed\": 4.36,\n" +
                    "        \"windGust\": 5.92,\n" +
                    "        \"windBearing\": 164,\n" +
                    "        \"cloudCover\": 0.43,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 257.66\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548986400,\n" +
                    "        \"summary\": \"Partly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.0003,\n" +
                    "        \"precipProbability\": 0.01,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 57.77,\n" +
                    "        \"apparentTemperature\": 57.77,\n" +
                    "        \"dewPoint\": 51.61,\n" +
                    "        \"humidity\": 0.8,\n" +
                    "        \"pressure\": 1012.52,\n" +
                    "        \"windSpeed\": 4.62,\n" +
                    "        \"windGust\": 5.74,\n" +
                    "        \"windBearing\": 195,\n" +
                    "        \"cloudCover\": 0.35,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 256.03\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548990000,\n" +
                    "        \"summary\": \"Partly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.0005,\n" +
                    "        \"precipProbability\": 0.02,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 56.71,\n" +
                    "        \"apparentTemperature\": 56.71,\n" +
                    "        \"dewPoint\": 51.55,\n" +
                    "        \"humidity\": 0.83,\n" +
                    "        \"pressure\": 1012.83,\n" +
                    "        \"windSpeed\": 4.85,\n" +
                    "        \"windGust\": 5.87,\n" +
                    "        \"windBearing\": 217,\n" +
                    "        \"cloudCover\": 0.29,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 254.72\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548993600,\n" +
                    "        \"summary\": \"Partly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.0008,\n" +
                    "        \"precipProbability\": 0.03,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 55.85,\n" +
                    "        \"apparentTemperature\": 55.85,\n" +
                    "        \"dewPoint\": 51.69,\n" +
                    "        \"humidity\": 0.86,\n" +
                    "        \"pressure\": 1013.14,\n" +
                    "        \"windSpeed\": 5.22,\n" +
                    "        \"windGust\": 6.79,\n" +
                    "        \"windBearing\": 227,\n" +
                    "        \"cloudCover\": 0.31,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 254.05\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548997200,\n" +
                    "        \"summary\": \"Partly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.0015,\n" +
                    "        \"precipProbability\": 0.05,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 55.13,\n" +
                    "        \"apparentTemperature\": 55.13,\n" +
                    "        \"dewPoint\": 51.91,\n" +
                    "        \"humidity\": 0.89,\n" +
                    "        \"pressure\": 1013.5,\n" +
                    "        \"windSpeed\": 5.61,\n" +
                    "        \"windGust\": 8.03,\n" +
                    "        \"windBearing\": 229,\n" +
                    "        \"cloudCover\": 0.35,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 253.73\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1549000800,\n" +
                    "        \"summary\": \"Partly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.002,\n" +
                    "        \"precipProbability\": 0.08,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 54.64,\n" +
                    "        \"apparentTemperature\": 54.64,\n" +
                    "        \"dewPoint\": 52.01,\n" +
                    "        \"humidity\": 0.91,\n" +
                    "        \"pressure\": 1013.75,\n" +
                    "        \"windSpeed\": 5.8,\n" +
                    "        \"windGust\": 8.83,\n" +
                    "        \"windBearing\": 225,\n" +
                    "        \"cloudCover\": 0.4,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 253.31\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1549004400,\n" +
                    "        \"summary\": \"Partly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.0018,\n" +
                    "        \"precipProbability\": 0.09,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 54.2,\n" +
                    "        \"apparentTemperature\": 54.2,\n" +
                    "        \"dewPoint\": 51.9,\n" +
                    "        \"humidity\": 0.92,\n" +
                    "        \"pressure\": 1013.91,\n" +
                    "        \"windSpeed\": 5.68,\n" +
                    "        \"windGust\": 8.64,\n" +
                    "        \"windBearing\": 212,\n" +
                    "        \"cloudCover\": 0.55,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 252.19\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1549008000,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.0015,\n" +
                    "        \"precipProbability\": 0.09,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 53.93,\n" +
                    "        \"apparentTemperature\": 53.93,\n" +
                    "        \"dewPoint\": 51.7,\n" +
                    "        \"humidity\": 0.92,\n" +
                    "        \"pressure\": 1013.99,\n" +
                    "        \"windSpeed\": 5.43,\n" +
                    "        \"windGust\": 8.02,\n" +
                    "        \"windBearing\": 194,\n" +
                    "        \"cloudCover\": 0.74,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 250.94\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1549011600,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.0013,\n" +
                    "        \"precipProbability\": 0.1,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 54.07,\n" +
                    "        \"apparentTemperature\": 54.07,\n" +
                    "        \"dewPoint\": 51.44,\n" +
                    "        \"humidity\": 0.91,\n" +
                    "        \"pressure\": 1013.9,\n" +
                    "        \"windSpeed\": 5.43,\n" +
                    "        \"windGust\": 7.81,\n" +
                    "        \"windBearing\": 177,\n" +
                    "        \"cloudCover\": 0.89,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 9.45,\n" +
                    "        \"ozone\": 250.47\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1549015200,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.0009,\n" +
                    "        \"precipProbability\": 0.1,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 53.92,\n" +
                    "        \"apparentTemperature\": 53.92,\n" +
                    "        \"dewPoint\": 51.16,\n" +
                    "        \"humidity\": 0.9,\n" +
                    "        \"pressure\": 1013.61,\n" +
                    "        \"windSpeed\": 5.9,\n" +
                    "        \"windGust\": 8.36,\n" +
                    "        \"windBearing\": 166,\n" +
                    "        \"cloudCover\": 0.92,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 9.27,\n" +
                    "        \"ozone\": 251.42\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1549018800,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0.0005,\n" +
                    "        \"precipProbability\": 0.08,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 53.6,\n" +
                    "        \"apparentTemperature\": 53.6,\n" +
                    "        \"dewPoint\": 50.86,\n" +
                    "        \"humidity\": 0.9,\n" +
                    "        \"pressure\": 1013.19,\n" +
                    "        \"windSpeed\": 6.64,\n" +
                    "        \"windGust\": 9.35,\n" +
                    "        \"windBearing\": 158,\n" +
                    "        \"cloudCover\": 0.93,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 9.42,\n" +
                    "        \"ozone\": 253.12\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1549022400,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0004,\n" +
                    "        \"precipProbability\": 0.08,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 53.11,\n" +
                    "        \"apparentTemperature\": 53.11,\n" +
                    "        \"dewPoint\": 50.58,\n" +
                    "        \"humidity\": 0.91,\n" +
                    "        \"pressure\": 1012.8,\n" +
                    "        \"windSpeed\": 7.34,\n" +
                    "        \"windGust\": 10.71,\n" +
                    "        \"windBearing\": 154,\n" +
                    "        \"cloudCover\": 0.94,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 9.84,\n" +
                    "        \"ozone\": 254.86\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1549026000,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0004,\n" +
                    "        \"precipProbability\": 0.08,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 52.65,\n" +
                    "        \"apparentTemperature\": 52.65,\n" +
                    "        \"dewPoint\": 50.38,\n" +
                    "        \"humidity\": 0.92,\n" +
                    "        \"pressure\": 1012.52,\n" +
                    "        \"windSpeed\": 7.9,\n" +
                    "        \"windGust\": 12.57,\n" +
                    "        \"windBearing\": 156,\n" +
                    "        \"cloudCover\": 0.96,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 256.42\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1549029600,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0005,\n" +
                    "        \"precipProbability\": 0.1,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 52.3,\n" +
                    "        \"apparentTemperature\": 52.3,\n" +
                    "        \"dewPoint\": 50.23,\n" +
                    "        \"humidity\": 0.93,\n" +
                    "        \"pressure\": 1012.28,\n" +
                    "        \"windSpeed\": 8.44,\n" +
                    "        \"windGust\": 14.77,\n" +
                    "        \"windBearing\": 162,\n" +
                    "        \"cloudCover\": 0.98,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 258.09\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1549033200,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0007,\n" +
                    "        \"precipProbability\": 0.11,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 52.41,\n" +
                    "        \"apparentTemperature\": 52.41,\n" +
                    "        \"dewPoint\": 50.07,\n" +
                    "        \"humidity\": 0.92,\n" +
                    "        \"pressure\": 1012.04,\n" +
                    "        \"windSpeed\": 9.19,\n" +
                    "        \"windGust\": 16.91,\n" +
                    "        \"windBearing\": 167,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 259.59\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1549036800,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0006,\n" +
                    "        \"precipProbability\": 0.1,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 52.9,\n" +
                    "        \"apparentTemperature\": 52.9,\n" +
                    "        \"dewPoint\": 49.91,\n" +
                    "        \"humidity\": 0.9,\n" +
                    "        \"pressure\": 1011.92,\n" +
                    "        \"windSpeed\": 10.38,\n" +
                    "        \"windGust\": 18.91,\n" +
                    "        \"windBearing\": 169,\n" +
                    "        \"cloudCover\": 0.99,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 260.78\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1549040400,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0005,\n" +
                    "        \"precipProbability\": 0.11,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 53.4,\n" +
                    "        \"apparentTemperature\": 53.4,\n" +
                    "        \"dewPoint\": 49.75,\n" +
                    "        \"humidity\": 0.87,\n" +
                    "        \"pressure\": 1011.8,\n" +
                    "        \"windSpeed\": 11.71,\n" +
                    "        \"windGust\": 20.84,\n" +
                    "        \"windBearing\": 170,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 1,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 261.85\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1549044000,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0007,\n" +
                    "        \"precipProbability\": 0.11,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 53.38,\n" +
                    "        \"apparentTemperature\": 53.38,\n" +
                    "        \"dewPoint\": 49.62,\n" +
                    "        \"humidity\": 0.87,\n" +
                    "        \"pressure\": 1011.5,\n" +
                    "        \"windSpeed\": 12.77,\n" +
                    "        \"windGust\": 22.53,\n" +
                    "        \"windBearing\": 170,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 2,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 263.89\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1549047600,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0028,\n" +
                    "        \"precipProbability\": 0.15,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 53.57,\n" +
                    "        \"apparentTemperature\": 53.57,\n" +
                    "        \"dewPoint\": 49.48,\n" +
                    "        \"humidity\": 0.86,\n" +
                    "        \"pressure\": 1010.91,\n" +
                    "        \"windSpeed\": 13.4,\n" +
                    "        \"windGust\": 23.7,\n" +
                    "        \"windBearing\": 169,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 2,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 267.84\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1549051200,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0088,\n" +
                    "        \"precipProbability\": 0.29,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 53.58,\n" +
                    "        \"apparentTemperature\": 53.58,\n" +
                    "        \"dewPoint\": 49.33,\n" +
                    "        \"humidity\": 0.85,\n" +
                    "        \"pressure\": 1010.11,\n" +
                    "        \"windSpeed\": 13.91,\n" +
                    "        \"windGust\": 24.67,\n" +
                    "        \"windBearing\": 168,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 3,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 272.7\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1549054800,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0155,\n" +
                    "        \"precipProbability\": 0.45,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 53.79,\n" +
                    "        \"apparentTemperature\": 53.79,\n" +
                    "        \"dewPoint\": 49.23,\n" +
                    "        \"humidity\": 0.85,\n" +
                    "        \"pressure\": 1009.17,\n" +
                    "        \"windSpeed\": 14.69,\n" +
                    "        \"windGust\": 26.09,\n" +
                    "        \"windBearing\": 166,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 3,\n" +
                    "        \"visibility\": 9.38,\n" +
                    "        \"ozone\": 276.38\n" +
                    "      }\n" +
                    "    ]\n" +
                    "  },\n" +
                    "  \"daily\": {\n" +
                    "    \"summary\": \"Light rain today through Tuesday, with high temperatures falling to 51°F on Monday.\",\n" +
                    "    \"icon\": \"rain\",\n" +
                    "    \"data\": [\n" +
                    "      {\n" +
                    "        \"time\": 1548835200,\n" +
                    "        \"summary\": \"Rain starting in the evening.\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"sunriseTime\": 1548861395,\n" +
                    "        \"sunsetTime\": 1548898311,\n" +
                    "        \"moonPhase\": 0.85,\n" +
                    "        \"precipIntensity\": 0.0099,\n" +
                    "        \"precipIntensityMax\": 0.0812,\n" +
                    "        \"precipIntensityMaxTime\": 1548918000,\n" +
                    "        \"precipProbability\": 0.62,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperatureHigh\": 59.82,\n" +
                    "        \"temperatureHighTime\": 1548885600,\n" +
                    "        \"temperatureLow\": 53.68,\n" +
                    "        \"temperatureLowTime\": 1548946800,\n" +
                    "        \"apparentTemperatureHigh\": 59.82,\n" +
                    "        \"apparentTemperatureHighTime\": 1548885600,\n" +
                    "        \"apparentTemperatureLow\": 53.68,\n" +
                    "        \"apparentTemperatureLowTime\": 1548946800,\n" +
                    "        \"dewPoint\": 49.06,\n" +
                    "        \"humidity\": 0.8,\n" +
                    "        \"pressure\": 1012.79,\n" +
                    "        \"windSpeed\": 1.51,\n" +
                    "        \"windGust\": 8.38,\n" +
                    "        \"windGustTime\": 1548914400,\n" +
                    "        \"windBearing\": 206,\n" +
                    "        \"cloudCover\": 0.72,\n" +
                    "        \"uvIndex\": 3,\n" +
                    "        \"uvIndexTime\": 1548878400,\n" +
                    "        \"visibility\": 9.13,\n" +
                    "        \"ozone\": 283.31,\n" +
                    "        \"temperatureMin\": 51.72,\n" +
                    "        \"temperatureMinTime\": 1548860400,\n" +
                    "        \"temperatureMax\": 59.82,\n" +
                    "        \"temperatureMaxTime\": 1548885600,\n" +
                    "        \"apparentTemperatureMin\": 51.72,\n" +
                    "        \"apparentTemperatureMinTime\": 1548860400,\n" +
                    "        \"apparentTemperatureMax\": 59.82,\n" +
                    "        \"apparentTemperatureMaxTime\": 1548885600\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1548921600,\n" +
                    "        \"summary\": \"Mostly cloudy throughout the day.\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"sunriseTime\": 1548947746,\n" +
                    "        \"sunsetTime\": 1548984779,\n" +
                    "        \"moonPhase\": 0.88,\n" +
                    "        \"precipIntensity\": 0.0157,\n" +
                    "        \"precipIntensityMax\": 0.095,\n" +
                    "        \"precipIntensityMaxTime\": 1548925200,\n" +
                    "        \"precipProbability\": 0.9,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperatureHigh\": 59.1,\n" +
                    "        \"temperatureHighTime\": 1548979200,\n" +
                    "        \"temperatureLow\": 52.3,\n" +
                    "        \"temperatureLowTime\": 1549029600,\n" +
                    "        \"apparentTemperatureHigh\": 59.1,\n" +
                    "        \"apparentTemperatureHighTime\": 1548979200,\n" +
                    "        \"apparentTemperatureLow\": 52.3,\n" +
                    "        \"apparentTemperatureLowTime\": 1549029600,\n" +
                    "        \"dewPoint\": 51.44,\n" +
                    "        \"humidity\": 0.86,\n" +
                    "        \"pressure\": 1012.34,\n" +
                    "        \"windSpeed\": 0.9,\n" +
                    "        \"windGust\": 8.83,\n" +
                    "        \"windGustTime\": 1549000800,\n" +
                    "        \"windBearing\": 211,\n" +
                    "        \"cloudCover\": 0.6,\n" +
                    "        \"uvIndex\": 3,\n" +
                    "        \"uvIndexTime\": 1548964800,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 270.81,\n" +
                    "        \"temperatureMin\": 53.68,\n" +
                    "        \"temperatureMinTime\": 1548946800,\n" +
                    "        \"temperatureMax\": 59.1,\n" +
                    "        \"temperatureMaxTime\": 1548979200,\n" +
                    "        \"apparentTemperatureMin\": 53.68,\n" +
                    "        \"apparentTemperatureMinTime\": 1548946800,\n" +
                    "        \"apparentTemperatureMax\": 59.1,\n" +
                    "        \"apparentTemperatureMaxTime\": 1548979200\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1549008000,\n" +
                    "        \"summary\": \"Windy starting in the afternoon and rain starting in the evening.\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"sunriseTime\": 1549034096,\n" +
                    "        \"sunsetTime\": 1549071246,\n" +
                    "        \"moonPhase\": 0.91,\n" +
                    "        \"precipIntensity\": 0.0232,\n" +
                    "        \"precipIntensityMax\": 0.1015,\n" +
                    "        \"precipIntensityMaxTime\": 1549076400,\n" +
                    "        \"precipProbability\": 0.91,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperatureHigh\": 55.09,\n" +
                    "        \"temperatureHighTime\": 1549065600,\n" +
                    "        \"temperatureLow\": 50.31,\n" +
                    "        \"temperatureLowTime\": 1549119600,\n" +
                    "        \"apparentTemperatureHigh\": 55.09,\n" +
                    "        \"apparentTemperatureHighTime\": 1549065600,\n" +
                    "        \"apparentTemperatureLow\": 50.31,\n" +
                    "        \"apparentTemperatureLowTime\": 1549119600,\n" +
                    "        \"dewPoint\": 50.13,\n" +
                    "        \"humidity\": 0.87,\n" +
                    "        \"pressure\": 1008.47,\n" +
                    "        \"windSpeed\": 14.37,\n" +
                    "        \"windGust\": 50.12,\n" +
                    "        \"windGustTime\": 1549087200,\n" +
                    "        \"windBearing\": 160,\n" +
                    "        \"cloudCover\": 0.97,\n" +
                    "        \"uvIndex\": 3,\n" +
                    "        \"uvIndexTime\": 1549051200,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 267.33,\n" +
                    "        \"temperatureMin\": 52.3,\n" +
                    "        \"temperatureMinTime\": 1549029600,\n" +
                    "        \"temperatureMax\": 55.09,\n" +
                    "        \"temperatureMaxTime\": 1549065600,\n" +
                    "        \"apparentTemperatureMin\": 52.3,\n" +
                    "        \"apparentTemperatureMinTime\": 1549029600,\n" +
                    "        \"apparentTemperatureMax\": 55.09,\n" +
                    "        \"apparentTemperatureMaxTime\": 1549065600\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1549094400,\n" +
                    "        \"summary\": \"Rain in the morning and breezy until afternoon.\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"sunriseTime\": 1549120445,\n" +
                    "        \"sunsetTime\": 1549157714,\n" +
                    "        \"moonPhase\": 0.94,\n" +
                    "        \"precipIntensity\": 0.0262,\n" +
                    "        \"precipIntensityMax\": 0.0676,\n" +
                    "        \"precipIntensityMaxTime\": 1549098000,\n" +
                    "        \"precipProbability\": 0.97,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperatureHigh\": 53.47,\n" +
                    "        \"temperatureHighTime\": 1549148400,\n" +
                    "        \"temperatureLow\": 49.72,\n" +
                    "        \"temperatureLowTime\": 1549206000,\n" +
                    "        \"apparentTemperatureHigh\": 53.47,\n" +
                    "        \"apparentTemperatureHighTime\": 1549148400,\n" +
                    "        \"apparentTemperatureLow\": 46.45,\n" +
                    "        \"apparentTemperatureLowTime\": 1549206000,\n" +
                    "        \"dewPoint\": 47.06,\n" +
                    "        \"humidity\": 0.83,\n" +
                    "        \"pressure\": 1004.03,\n" +
                    "        \"windSpeed\": 16.76,\n" +
                    "        \"windGust\": 46.18,\n" +
                    "        \"windGustTime\": 1549094400,\n" +
                    "        \"windBearing\": 226,\n" +
                    "        \"cloudCover\": 0.76,\n" +
                    "        \"uvIndex\": 3,\n" +
                    "        \"uvIndexTime\": 1549137600,\n" +
                    "        \"visibility\": 6.65,\n" +
                    "        \"ozone\": 306.81,\n" +
                    "        \"temperatureMin\": 50.31,\n" +
                    "        \"temperatureMinTime\": 1549119600,\n" +
                    "        \"temperatureMax\": 53.89,\n" +
                    "        \"temperatureMaxTime\": 1549094400,\n" +
                    "        \"apparentTemperatureMin\": 50.31,\n" +
                    "        \"apparentTemperatureMinTime\": 1549119600,\n" +
                    "        \"apparentTemperatureMax\": 53.89,\n" +
                    "        \"apparentTemperatureMaxTime\": 1549094400\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1549180800,\n" +
                    "        \"summary\": \"Mostly cloudy throughout the day.\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"sunriseTime\": 1549206792,\n" +
                    "        \"sunsetTime\": 1549244182,\n" +
                    "        \"moonPhase\": 0.97,\n" +
                    "        \"precipIntensity\": 0.0093,\n" +
                    "        \"precipIntensityMax\": 0.019,\n" +
                    "        \"precipIntensityMaxTime\": 1549260000,\n" +
                    "        \"precipProbability\": 0.86,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperatureHigh\": 52.81,\n" +
                    "        \"temperatureHighTime\": 1549234800,\n" +
                    "        \"temperatureLow\": 46.51,\n" +
                    "        \"temperatureLowTime\": 1549292400,\n" +
                    "        \"apparentTemperatureHigh\": 52.81,\n" +
                    "        \"apparentTemperatureHighTime\": 1549234800,\n" +
                    "        \"apparentTemperatureLow\": 40.99,\n" +
                    "        \"apparentTemperatureLowTime\": 1549292400,\n" +
                    "        \"dewPoint\": 45.2,\n" +
                    "        \"humidity\": 0.81,\n" +
                    "        \"pressure\": 1011.58,\n" +
                    "        \"windSpeed\": 9.96,\n" +
                    "        \"windGust\": 22.96,\n" +
                    "        \"windGustTime\": 1549263600,\n" +
                    "        \"windBearing\": 220,\n" +
                    "        \"cloudCover\": 0.76,\n" +
                    "        \"uvIndex\": 3,\n" +
                    "        \"uvIndexTime\": 1549224000,\n" +
                    "        \"visibility\": 7.58,\n" +
                    "        \"ozone\": 295.68,\n" +
                    "        \"temperatureMin\": 49.72,\n" +
                    "        \"temperatureMinTime\": 1549206000,\n" +
                    "        \"temperatureMax\": 52.81,\n" +
                    "        \"temperatureMaxTime\": 1549234800,\n" +
                    "        \"apparentTemperatureMin\": 46.33,\n" +
                    "        \"apparentTemperatureMinTime\": 1549216800,\n" +
                    "        \"apparentTemperatureMax\": 52.81,\n" +
                    "        \"apparentTemperatureMaxTime\": 1549234800\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1549267200,\n" +
                    "        \"summary\": \"Mostly cloudy until evening and breezy until afternoon.\",\n" +
                    "        \"icon\": \"wind\",\n" +
                    "        \"sunriseTime\": 1549293137,\n" +
                    "        \"sunsetTime\": 1549330650,\n" +
                    "        \"moonPhase\": 0,\n" +
                    "        \"precipIntensity\": 0.0047,\n" +
                    "        \"precipIntensityMax\": 0.0149,\n" +
                    "        \"precipIntensityMaxTime\": 1549281600,\n" +
                    "        \"precipProbability\": 0.66,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperatureHigh\": 49.78,\n" +
                    "        \"temperatureHighTime\": 1549321200,\n" +
                    "        \"temperatureLow\": 42.44,\n" +
                    "        \"temperatureLowTime\": 1549375200,\n" +
                    "        \"apparentTemperatureHigh\": 43.91,\n" +
                    "        \"apparentTemperatureHighTime\": 1549321200,\n" +
                    "        \"apparentTemperatureLow\": 37.23,\n" +
                    "        \"apparentTemperatureLowTime\": 1549375200,\n" +
                    "        \"dewPoint\": 38.26,\n" +
                    "        \"humidity\": 0.69,\n" +
                    "        \"pressure\": 1013.76,\n" +
                    "        \"windSpeed\": 12.24,\n" +
                    "        \"windGust\": 25.57,\n" +
                    "        \"windGustTime\": 1549281600,\n" +
                    "        \"windBearing\": 310,\n" +
                    "        \"cloudCover\": 0.54,\n" +
                    "        \"uvIndex\": 3,\n" +
                    "        \"uvIndexTime\": 1549310400,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 292.03,\n" +
                    "        \"temperatureMin\": 46.51,\n" +
                    "        \"temperatureMinTime\": 1549292400,\n" +
                    "        \"temperatureMax\": 50.82,\n" +
                    "        \"temperatureMaxTime\": 1549267200,\n" +
                    "        \"apparentTemperatureMin\": 40.67,\n" +
                    "        \"apparentTemperatureMinTime\": 1549299600,\n" +
                    "        \"apparentTemperatureMax\": 50.82,\n" +
                    "        \"apparentTemperatureMaxTime\": 1549267200\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1549353600,\n" +
                    "        \"summary\": \"Clear throughout the day.\",\n" +
                    "        \"icon\": \"clear-day\",\n" +
                    "        \"sunriseTime\": 1549379481,\n" +
                    "        \"sunsetTime\": 1549417118,\n" +
                    "        \"moonPhase\": 0.03,\n" +
                    "        \"precipIntensity\": 0.0036,\n" +
                    "        \"precipIntensityMax\": 0.0335,\n" +
                    "        \"precipIntensityMaxTime\": 1549368000,\n" +
                    "        \"precipProbability\": 0.14,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperatureHigh\": 53.2,\n" +
                    "        \"temperatureHighTime\": 1549411200,\n" +
                    "        \"temperatureLow\": 43.41,\n" +
                    "        \"temperatureLowTime\": 1549468800,\n" +
                    "        \"apparentTemperatureHigh\": 53.2,\n" +
                    "        \"apparentTemperatureHighTime\": 1549411200,\n" +
                    "        \"apparentTemperatureLow\": 37.47,\n" +
                    "        \"apparentTemperatureLowTime\": 1549468800,\n" +
                    "        \"dewPoint\": 32.82,\n" +
                    "        \"humidity\": 0.57,\n" +
                    "        \"pressure\": 1020.11,\n" +
                    "        \"windSpeed\": 8.59,\n" +
                    "        \"windGust\": 14.12,\n" +
                    "        \"windGustTime\": 1549353600,\n" +
                    "        \"windBearing\": 350,\n" +
                    "        \"cloudCover\": 0,\n" +
                    "        \"uvIndex\": 3,\n" +
                    "        \"uvIndexTime\": 1549393200,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 296.03,\n" +
                    "        \"temperatureMin\": 42.44,\n" +
                    "        \"temperatureMinTime\": 1549375200,\n" +
                    "        \"temperatureMax\": 53.2,\n" +
                    "        \"temperatureMaxTime\": 1549411200,\n" +
                    "        \"apparentTemperatureMin\": 37.23,\n" +
                    "        \"apparentTemperatureMinTime\": 1549375200,\n" +
                    "        \"apparentTemperatureMax\": 53.2,\n" +
                    "        \"apparentTemperatureMaxTime\": 1549411200\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1549440000,\n" +
                    "        \"summary\": \"Mostly cloudy starting in the evening.\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"sunriseTime\": 1549465823,\n" +
                    "        \"sunsetTime\": 1549503585,\n" +
                    "        \"moonPhase\": 0.06,\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipIntensityMax\": 0.0001,\n" +
                    "        \"precipIntensityMaxTime\": 1549440000,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperatureHigh\": 53.37,\n" +
                    "        \"temperatureHighTime\": 1549497600,\n" +
                    "        \"temperatureLow\": 46.23,\n" +
                    "        \"temperatureLowTime\": 1549551600,\n" +
                    "        \"apparentTemperatureHigh\": 53.37,\n" +
                    "        \"apparentTemperatureHighTime\": 1549497600,\n" +
                    "        \"apparentTemperatureLow\": 42.08,\n" +
                    "        \"apparentTemperatureLowTime\": 1549551600,\n" +
                    "        \"dewPoint\": 28.15,\n" +
                    "        \"humidity\": 0.46,\n" +
                    "        \"pressure\": 1026.17,\n" +
                    "        \"windSpeed\": 10.64,\n" +
                    "        \"windGust\": 15.82,\n" +
                    "        \"windGustTime\": 1549447200,\n" +
                    "        \"windBearing\": 34,\n" +
                    "        \"cloudCover\": 0.13,\n" +
                    "        \"uvIndex\": 4,\n" +
                    "        \"uvIndexTime\": 1549483200,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 283.1,\n" +
                    "        \"temperatureMin\": 43.41,\n" +
                    "        \"temperatureMinTime\": 1549468800,\n" +
                    "        \"temperatureMax\": 53.37,\n" +
                    "        \"temperatureMaxTime\": 1549497600,\n" +
                    "        \"apparentTemperatureMin\": 37.47,\n" +
                    "        \"apparentTemperatureMinTime\": 1549468800,\n" +
                    "        \"apparentTemperatureMax\": 53.37,\n" +
                    "        \"apparentTemperatureMaxTime\": 1549497600\n" +
                    "      }\n" +
                    "    ]\n" +
                    "  },\n" +
                    "  \"flags\": {\n" +
                    "    \"sources\": [\n" +
                    "      \"nearest-precip\",\n" +
                    "      \"nwspa\",\n" +
                    "      \"cmc\",\n" +
                    "      \"gfs\",\n" +
                    "      \"hrrr\",\n" +
                    "      \"icon\",\n" +
                    "      \"isd\",\n" +
                    "      \"madis\",\n" +
                    "      \"nam\",\n" +
                    "      \"sref\",\n" +
                    "      \"darksky\"\n" +
                    "    ],\n" +
                    "    \"nearest-station\": 1.839,\n" +
                    "    \"units\": \"us\"\n" +
                    "  },\n" +
                    "  \"offset\": -8\n" +
                    "}"
    ).toString();
}
