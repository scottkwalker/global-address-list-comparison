global-address-list-comparison
==============================
Latest version [![GitHub version](https://badge.fury.io/gh/scottkwalker%2Fglobal-address-list-comparison.svg)](http://badge.fury.io/gh/scottkwalker%2Fglobal-address-list-comparison)

Just a few lines of Scala to show how to find the difference between two semi-colon delimited lists

Development prerequisites
-----------------------
1.  JDK 1.7.51 or 1.8 must be installed

2.  Install SBT.  The [current documentation][install-sbt] suggests:

    Mac: assuming homebrew is installed, `brew install sbt`

3.  If you are using Java 7 then you should increase the 'permanent generation space' requirements for SBT. Note: PermGen is managed automatically in Java 8.

    Mac: Create the file `~/.sbtconfig` with the following content:

        SBT_OPTS="-XX:+UseConcMarkSweepGC -XX:+CMSClassUnloadingEnabled -XX:PermSize=256M -XX:MaxPermSize=2048M"

Version control
---------------
I am using Git with Github because:

* I am familiar with Github from using it on several projects.
* I prefer using Git for version control as it works well with TDD's short iterations of coding. Also Git is great for local commits when I am working from a train with no 4G signal.

[install-sbt]: http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html#installing-sbt "Install SBT"

Scott Walker
============
Hello! I'm a software developer based in London. I have a lot of experience working in Agile, TDD environments. I really enjoy functional programming and have put together this Scala application as a way to practice techniques.

A few of the big government projects ([Carer's Allowance](https://github.com/Department-for-Work-and-Pensions/ClaimCapture) and [DVLA](https://github.com/dvla)) are in the process of being regularly open sourced.

LinkedIn
--------
You can find out more about the other projects I've worked on through my [![View Scott Walker's profile on LinkedIn](https://static.licdn.com/scds/common/u/img/webpromo/btn_profile_greytxt_80x15.png)](http://uk.linkedin.com/in/scottwalkerlondon)

Stackoverflow
-------------
<a href="http://stackoverflow.com/users/2119533/scott-walker">
<img src="http://stackoverflow.com/users/flair/2119533.png?theme=clean" width="208" height="58" alt="profile for Scott Walker at Stack Overflow, Q&amp;A for professional and enthusiast programmers" title="profile for Scott Walker at Stack Overflow, Q&amp;A for professional and enthusiast programmers">
</a>