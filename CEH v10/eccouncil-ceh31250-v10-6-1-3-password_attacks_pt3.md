- Filename: eccouncil-ceh31250-v10-6-1-3-password_attacks_pt3.md
- Show Name: CEHv10 (312-50)
- Topic Name: Attacks and Exploits
- Episode Name: Password Attacks Pt.3
- Description: In this episode, Daniel and Zach finish looking at password
attacks and tools. Here they walk you through using the very popular John the
Ripper and Hashcat CLI-based password cracking tools.

================================================================================


Password Attacks Pt.3
--------------------------------------------------------------------------------



- Offline cracking tools
  + CLI
    - John the Ripper
      + `john nixPass.txt`
      + `john nixPass.txt --show`
      + 'john --format=NT -w=rockyou.txt NTLM.txt'
    - Hashcat
      + Windows
        - `hashcat -m 0 -a 0 mimidump.txt /usr/share/wordlists/rockyou.txt --force`
      + Unix/Linux
        - `hashcat -m 1800 -a 0 nixPass.txt /usr/share/wordlists/rockyou.txt --force`
        - `cat /root/.hashcat/hashcat.potfile`
