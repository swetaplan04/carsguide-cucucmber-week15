$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cardealer.feature");
formatter.feature({
  "line": 2,
  "name": "Search functionality",
  "description": "",
  "id": "search-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@cardealer"
    }
  ]
});
formatter.before({
  "duration": 19038593900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Search the dealer name",
  "description": "",
  "id": "search-functionality;search-the-dealer-name",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I mouse hover on “buy+sell” tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click ‘Find a Dealer’ link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I see the dealer lists",
  "rows": [
    {
      "cells": [
        "3 Point Motors Epping"
      ],
      "line": 9
    },
    {
      "cells": [
        "4WD Specialist Group"
      ],
      "line": 10
    },
    {
      "cells": [
        "5 Star Auto Trade"
      ],
      "line": 11
    },
    {
      "cells": [
        "A\u0026S Autos Pty Ltd"
      ],
      "line": 12
    },
    {
      "cells": [
        "A1 Motors Company Glenorchy"
      ],
      "line": 13
    },
    {
      "cells": [
        "Amac Motor Group"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "BuySteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 345057200,
  "status": "passed"
});
formatter.match({
  "location": "BuySteps.iMouseHoverOnBuySellTab()"
});
formatter.result({
  "duration": 432594199,
  "status": "passed"
});
formatter.match({
  "location": "FindDealerSteps.iClickFindADealerLink()"
});
formatter.result({
  "duration": 3722781399,
  "status": "passed"
});
formatter.match({
  "location": "FindDealerSteps.iSeeTheDealerLists(DataTable)"
});
formatter.result({
  "duration": 59706991200,
  "status": "passed"
});
formatter.after({
  "duration": 3186574801,
  "status": "passed"
});
});