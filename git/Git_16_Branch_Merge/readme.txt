git init
git add .
git commit -m "initia commit"
git checkout -b issue123
// touch file
git commit -m "readme edits"
git checkout master
git checkout -b hotissue
// touch file
git commit -m "hot issue fix"
git checkout master
git merge hotissue
git branch -d hotfix
git checkout issue123
// touch file
git commit -m "readme edits 2"
git checkout master
git checkout master