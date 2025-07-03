# Java 18 AWT

JEP 400: UTF-8 by Default 的關係，在預設使用 ASCII 的 Windows 作業系統下，AWT 很多元件無法正常顯示中文。

解決辦法是啟動 Java 程式時，下參數 -Dfile.encoding=MS950 指定 Gig5 字元編碼，或 -Dfile.encoding=GBK。