job("emacsd") {
    scm {
        github "https://github.com/yehohanan7/emacsd.git"
    }
    triggers {
        scm 'H/5 * * * *'
    }
    steps {
        shell 'ps aux'
    }
}
