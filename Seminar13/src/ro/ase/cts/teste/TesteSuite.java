package ro.ase.cts.teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        GrupaTest.class,
        GrupaTestMocks.class,
        TesteGrupaCuFixture.class
})
public class TesteSuite {
}
