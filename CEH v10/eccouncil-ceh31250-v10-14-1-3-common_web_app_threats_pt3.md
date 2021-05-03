- Filename: eccouncil-ceh31250-v10-14-1-3-common_web_app_threats_pt3.md
- Show Name: CEHv10 (312-50)
- Topic Name: Hacking Web Applications
- Episode Name: Common Web App Threats Pt.3
- Description: In this episode, Daniel and Zach walk you through the plethora of
threats geared toward Web Applications. Here they will demonstrate the dangers
of using both broken and weak authentication mechanisms. They then turn their
focus towards sensitive data leaks via poor/no encoding, as well as leveraging
XML External Entities(XXE) attacks to access possible sensitive information.

================================================================================


Common Web App Threats Pt.3
--------------------------------------------------------------------------------


- Broken Authentication
  + Weak passwords
    - Use ZAP!
  + Logout management
    - Use bWAPP
- Data Exposure
  + Poor/no encryption
    - bWAPP Base64 Encoding (Secret)
- Server-Side Request Forgery (SSRF)
  + XML External Entity (XXE)
    - Read /etc/passwd
    - get info from kali /root/Documents/XXE-Attack.txt
