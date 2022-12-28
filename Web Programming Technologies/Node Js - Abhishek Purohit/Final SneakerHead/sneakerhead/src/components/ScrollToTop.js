import {useEffect} from 'react';

export default function ScrollToTop() {
  useEffect(() => {
    window.scrollTo({top: 0, left: 0, behavior: 'smooth'});
  }, []);

  return (
    <div>
      <div style={{height: 'auto' }} />

      {/* 👇️ scroll to top on button click */}
      <button
        onClick={() => {
          window.scrollTo({top: 0, left: 0, behavior: 'smooth'});
        }}
        style={{
          position: 'fixed',
          fontSize: '40px',
          bottom: '40px',
          right: '40px',
          color: '#fff',
          textAlign: 'center',
          borderRadius : '20px',
        }}
      >
        ⬆️
      </button>
    </div>
  );
}
