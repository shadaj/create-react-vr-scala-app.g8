import { ReactInstance } from 'react-360-web';

function init(bundle, parent, options) {
  const r360 = new ReactInstance(bundle, parent, {
    // Add custom options here
    fullScreen: true,
    ...options,
  });

  const surface = r360.getDefaultSurface();
  surface.resize(4680, 720);
  
  r360.renderToSurface(
    r360.createRoot('$name$', { /* initial props */ }),
    r360.getDefaultSurface()
  );
}

window.React360 = {init};
