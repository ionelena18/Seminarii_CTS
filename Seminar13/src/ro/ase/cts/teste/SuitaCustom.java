package ro.ase.cts.teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.categorii.ConstructorGrupeCategory;
import ro.ase.cts.categorii.GetPromovabilitateCategory;
import ro.ase.cts.categorii.TesteUrgenteCategorii;

@RunWith(Categories.class)
@Suite.SuiteClasses({GrupaTestMocks.class,GrupaTest.class,TesteGrupaCuFixture.class})
//@Categories.IncludeCategory(GetPromovabilitateCategory.class)
@Categories.ExcludeCategory({GetPromovabilitateCategory.class, ConstructorGrupeCategory.class})
public class SuitaCustom {
}
