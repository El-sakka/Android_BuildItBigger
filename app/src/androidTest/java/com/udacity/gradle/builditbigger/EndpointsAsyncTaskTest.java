package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.v4.util.Pair;
import android.test.AndroidTestCase;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static org.junit.Assert.*;


public class EndpointsAsyncTaskTest extends AndroidTestCase {
    public void testEndPointJoke() {
        try {
            MainActivity.EndpointsAsyncTask endpointsAsyncTask = new MainActivity.EndpointsAsyncTask();
            endpointsAsyncTask.execute(new Pair<Context, String>(getContext(), null));
            String joke = endpointsAsyncTask.get(60, TimeUnit.SECONDS);
            assertNotNull(joke);
            assertTrue(joke.length() > 0);
        } catch (InterruptedException e) {
            e.printStackTrace();
            fail("timeout");
        } catch (ExecutionException e) {
            e.printStackTrace();
            fail("timeout");
        } catch (TimeoutException e) {
            e.printStackTrace();
            fail("timeout");
        }
    }
}