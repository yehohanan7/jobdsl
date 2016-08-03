job("emacsd") {
    scm {
        github "yehohanan7/emacsd"
    }
    triggers {
        scm 'H/5 * * * *'
    }
    steps {
        shell 'ps aux'
    }
}
