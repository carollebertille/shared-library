#!/usr/bin/env groovy

// check bach syntax
def call(){

    sh 'csslint  \${WORKSPACE}/source_code/static/css/dataTables.bootstrap.css'

}
