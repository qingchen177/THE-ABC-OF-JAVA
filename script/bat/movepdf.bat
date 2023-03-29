::设置编码UTF-8
chcp 65001
set location=%1
cd %location%
md D:\books\%location%
for /r . %%b in (*.pdf ) do ( copy "%%b" D:\books\%location%)
pause