// Generated by Dagger (https://dagger.dev).
package com.zhuinden.simplestackmultimodule.application;

import com.zhuinden.simplestackmoduleexample.common.ScopedService;

import java.util.Map;

import javax.inject.Provider;

import dagger.internal.Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ServiceProvider_Factory implements Factory<ServiceProvider> {
  private final Provider<Map<Class<? extends ScopedService>, Provider<ScopedService>>> servicesProvider;

  public ServiceProvider_Factory(
      Provider<Map<Class<? extends ScopedService>, Provider<ScopedService>>> servicesProvider) {
    this.servicesProvider = servicesProvider;
  }

  @Override
  public ServiceProvider get() {
    return newInstance(servicesProvider.get());
  }

  public static ServiceProvider_Factory create(
      Provider<Map<Class<? extends ScopedService>, Provider<ScopedService>>> servicesProvider) {
    return new ServiceProvider_Factory(servicesProvider);
  }

  public static ServiceProvider newInstance(
      Map<Class<? extends ScopedService>, Provider<ScopedService>> services) {
    return new ServiceProvider(services);
  }
}