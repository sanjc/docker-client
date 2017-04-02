package de.gesellix.docker.client.system

import de.gesellix.docker.client.DockerAsyncCallback
import de.gesellix.docker.client.DockerResponse

interface ManageSystem {

//    df          Show docker disk usage

    def systemDf()

    def systemDf(query)

//    events      Get real time events from the server

    def events(DockerAsyncCallback callback)

    def events(DockerAsyncCallback callback, Map query)

    DockerResponse ping()

    DockerResponse version()

//    info        Display system-wide information

    DockerResponse info()

//    TODO prune       Remove unused data

}
