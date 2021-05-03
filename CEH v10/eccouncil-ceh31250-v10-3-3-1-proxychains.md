- Filename: eccouncil-ceh31250-v10-3-3-1-proxychains.md
- Show Name: CEHv10 (312-50)
- Topic Name: Information Gathering and Vulnerability Identification
- Episode Name: ProxyChains
- Description: In this episode, Daniel and Zach show you how to use ProxyChains
to obfuscate your contact with a target network even bypassing security features
like IDSs and Firewalls. ProxyChains will also allow you to use a compromised
host to pivot into segregated internal networks. 

================================================================================


ProxyChains
--------------------------------------------------------------------------------


+ Proxychains
  - Tool that allows you to bounce your traffic through a list of proxy servers
    + Helps to obfuscate traffic source information
    + Can bypass IDS\Firewall
  - Pivoting tool
  - Allows you to use compromised host as a proxy for accessing otherwise
    unaccessible targets
    + **DIAGRAM**
  - Uses *proxychains.conf*
    + We can add a list of proxy servers here
      - Google free proxy servers
        + http://spys.one/en
  - DEMO:
    1. `ssh -D 127.0.0.1:8888 victim@compromised_host_ip`
    2. Open new terminal
    3. Edit */etc/proxychains.conf*
      - Add line to bottom: `socks4 127.0.0.1 8888`
    4. `proxychains rdesktop remote_server_ip`
