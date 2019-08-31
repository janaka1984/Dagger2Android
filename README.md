# Dagger2Android

1) Add Dagger2 Dependency to App level build.gradle
  /** Dagger2 **/
 api 'com.google.dagger:dagger:2.18'
 annotationProcessor 'com.google.dagger:dagger-compiler:2.18'
 
2) Define Module class and provide data 
    
    @Module
    
    public class RefrigeratorModule {
    
        public RefrigeratorModule(){}
        
        @Provides
        String provideEggs(){
            return "2 eggs";
        }
    }
    
    
  3) Define Componenet class that is bridge between modules and Activity that is request dependency
  
    @Component(modules = RefrigeratorModule.class)
    
    public interface AppComponent {

      void inject(MainActivity mainActivity);
    }
    
    
   4) Define Application class that build DaggerAppComponent (auto generated when rebuild app after (3) step) 
    
      @Override
      
      public void onCreate(){

          super.onCreate();

          appComponent = DaggerAppComponent.builder()

                 .refrigeratorModule(new RefrigeratorModule())

                  .build();
      }

      public AppComponent getAppComponent(){
          return appComponent;
      }
      
  5) Add android:name=".EggsApplication"  to AndroidManifest.xml
  
  
  Link Dagger2Kotlin https://github.com/janaka1984/Dagger2kotlin
