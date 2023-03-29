@echo off
::设置编码UTF-8
chcp 65001
title 7z解压脚本
set location=%1
cd %location%
for /r . %%a in (*.rar *.zip *.7z) do ( echo "%%i" & cd "%%~pa" & 7z x "%%a" -p1010 -Y)
cd D:\BaiduNetdiskDownload
call movepdf.bat %location%
pause