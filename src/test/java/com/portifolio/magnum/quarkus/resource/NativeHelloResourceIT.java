package com.portifolio.magnum.quarkus.resource;

import com.portifolio.magnum.quarkus.resource.HelloResourceTest;
import io.quarkus.test.junit.SubstrateTest;

@SubstrateTest
public class NativeHelloResourceIT extends HelloResourceTest {

    // Execute the same tests but in native mode.
}