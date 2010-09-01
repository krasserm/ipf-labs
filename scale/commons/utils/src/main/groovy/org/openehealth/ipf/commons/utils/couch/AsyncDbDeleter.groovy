package org.openehealth.ipf.commons.utils.couch

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import org.apache.commons.httpclient.HttpClient
import org.apache.commons.httpclient.methods.DeleteMethod

class AsyncDbDeleter {
    private ExecutorService executorService = Executors.newCachedThreadPool()

    void deleteDb(Database db) {
        executorService.execute {
            while (!deleteDatabase(db)) { Thread.sleep(500) }
        } as Runnable
    }

    void terminate() {
        executorService.shutdown()
        executorService.awaitTermination(1, TimeUnit.MINUTES)
    }

    private boolean deleteDatabase(Database db) {
        def client = new HttpClient()
        def method = new DeleteMethod(db.resource.resource.getURI().toString())
        def statusCode = client.executeMethod(method)
        method.releaseConnection()
        statusCode != 500
    }
}
